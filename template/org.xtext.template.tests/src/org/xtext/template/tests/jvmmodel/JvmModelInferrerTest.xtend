package org.xtext.template.tests.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.parameterized.InjectParameter
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner
import org.eclipse.xtext.junit4.parameterized.ResourceURIs
import org.eclipse.xtext.junit4.parameterized.XpectString
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.template.TemplateInjectorProvider

@SuppressWarnings("restriction")
@InjectWith(typeof(TemplateInjectorProvider))
@RunWith(typeof(ParameterizedXtextRunner))
@ResourceURIs(baseDir = "src/org/xtext/template/tests/jvmmodel", fileExtensions = "template")
public class JvmModelInferrerTest {

	@InjectParameter
	XtextResource resource;
	
	@Inject
	JvmModelSignatureGenerator signatureGenerator 
	
	@Inject
	ValidationTestHelper validator
	
	@Test 
	def noErrors() {
		validator.assertNoErrors(resource.contents.get(0))
	}

	@XpectString
	def String javaSignatures() {
		val fsa = new InMemoryFileSystemAccess()
		signatureGenerator.doGenerate(resource, fsa)
		fsa.files.values.join("\n").trim
	}
}

class JvmModelSignatureGenerator extends JvmModelGenerator {
	override generateExecutableBody(JvmExecutable op, ITreeAppendable appendable) {
		appendable.append("{...}")
	}
}
