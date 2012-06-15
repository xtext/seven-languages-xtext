package org.xtext.tortoiseshell.interpreter

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter
import org.xtext.tortoiseshell.runtime.Tortoise
import org.xtext.tortoiseshell.tortoiseShell.Function
import org.xtext.tortoiseshell.tortoiseShell.Program

class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
	
	@Inject extension IJvmModelAssociations 
	
	@Inject Provider<IEvaluationContext> contextProvider;
	
	@Inject FeatureCallToJavaMapping callToJavaMapping
	
	override execute(Tortoise tortoise, XtextResource resource) {
		if(resource != null && resource.errors.empty && tortoise != null) {
			val program  = resource.contents.filter(typeof(Program)).head
			if(program != null) {
				val context = contextProvider.get
				context.newValue(XbaseScopeProvider::THIS, program.jvmElements.filter(typeof(JvmDeclaredType)).head)
				context.newValue(XbaseScopeProvider::IT, tortoise)
				setClassLoader(this.^class.classLoader)
				evaluate(program.body, context.fork, CancelIndicator::NullImpl)
			}
		}
	}
	
	override protected _featureCallOperation(JvmOperation operation, XAbstractFeatureCall featureCall, Object receiver,
			IEvaluationContext context, CancelIndicator indicator) {
		val operationArguments = callToJavaMapping.getActualArguments(featureCall)
		val argumentValues = evaluateArgumentExpressions(operation, operationArguments, context, indicator)
		val function = operation.sourceElements.head
		if(function instanceof Function) {
			val functionCallContext = contextProvider.get
			functionCallContext.newValue(XbaseScopeProvider::THIS, context.getValue(XbaseScopeProvider::THIS))
			var index = 0
			for(param: operation.parameters) {
				functionCallContext.newValue(QualifiedName::create(param.name), argumentValues.get(index))
				index = index + 1	
			}
			evaluate((function as Function).body, functionCallContext, indicator)
		} else {
			super.invokeOperation(operation, receiver, argumentValues)
		}
	}
	
	/**
	 * Fixes a TODO in super.getReceiver()
	 */
	override protected getReceiver(XAssignment assignment, IEvaluationContext context, CancelIndicator indicator) {
		if (assignment.assignable == null) {
			val implicitReceiver = assignment.implicitReceiver
			if(implicitReceiver instanceof XFeatureCall) {
				val implicitReceiverName = (implicitReceiver as XFeatureCall)?.feature?.identifier
				if(implicitReceiverName != null) 
					return context.getValue(QualifiedName::create(implicitReceiverName))
			}
		} 
		super.getReceiver(assignment, context, indicator)
	}
}