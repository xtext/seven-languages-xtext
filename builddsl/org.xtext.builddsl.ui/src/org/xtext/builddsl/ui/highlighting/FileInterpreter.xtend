package org.xtext.builddsl.ui.highlighting

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XStringLiteral
import org.xtext.builddsl.lib.Literals

import static extension org.xtext.builddsl.lib.FileExtensions.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XVariableDeclaration

class FileInterpreter {
	
	@Inject extension IJavaProjectProvider
	
	def dispatch getFile(XExpression lit) {
		null
	}
	
	def dispatch File getFile(XBinaryOperation call) {
		if(call.feature == null || call.feature.eIsProxy)
			return null
		switch(call.feature.simpleName) {
			case "operator_divide": {
				if(call.rightOperand instanceof XStringLiteral) {
					try {
						val left = getFile(call.leftOperand)
						val right = (call.rightOperand as XStringLiteral).value
						return left/right
					} catch (Throwable t) {}
				}
			}
		}
	}
	
	def dispatch File getFile(XFeatureCall call) {
		val feature = call.feature
		if(feature != null && !feature.eIsProxy)
			switch feature {
				JvmMember: getStaticFile(feature)
				XVariableDeclaration: getFile(feature.right)
			}
	}
	
	def getProject(EObject ctx) {
		ctx.eResource.resourceSet.javaProject?.project
	}
	
	def private dispatch File getStaticFile(JvmOperation call) {
		if(!call.parameters.empty || !call.^static)
			return null
		if(call.declaringType.qualifiedName.startsWith(typeof(Literals).^package.name)) {
			switch call.simpleName {
				case "git":       call.project?.location?.toFile?.containingGitRepository
				case "project":   call.project?.location?.toFile
				case "workspace": call.project?.workspace?.root?.location?.toFile
				case "file":      new File("/")
			}
		} 
	}
	
	def private dispatch File getStaticFile(JvmMember call) {
		null
	}
}