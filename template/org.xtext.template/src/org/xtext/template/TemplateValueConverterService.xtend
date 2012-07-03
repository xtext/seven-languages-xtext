package org.xtext.template

import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class TemplateValueConverterService extends XbaseValueConverterService {

	val exp2exp = new TextValueConverter('?>', '<?')
	val exp2stm = new TextValueConverter('?>', '<%')
	val stm2exp = new TextValueConverter('%>', '<?')
	val stm2stm = new TextValueConverter('%>', '<%')

	@ValueConverter(rule = 'TEXT_EXP2EXP')
	def getTEXT_EXP2EXPValueConverter() {
		exp2exp
	}

	@ValueConverter(rule = 'TEXT_EXP2STM')
	def getTEXT_EXP2STMValueConverter() {
		exp2stm
	}

	@ValueConverter(rule = 'TEXT_STM2EXP')
	def getTEXT_STM2EXPValueConverter() {
		stm2exp
	}

	@ValueConverter(rule = 'TEXT_STM2STM')
	def getTEXT_STM2STMValueConverter() {
		stm2stm
	}
}

class TextValueConverter extends AbstractValueConverter<String> {
	String postfix
	String prefix

	new(String prefix, String postfix) {
		super()
		this.prefix = prefix
		this.postfix = postfix
	}

	override String toString(String value) {
		prefix + (value ?: '') + postfix
	}

	override String toValue(String string, INode node) throws ValueConverterException {
		if (string == null)
			return null
		var result = string
		if (result.startsWith(prefix))
			result = result.substring(prefix.length())
		if (result.endsWith(postfix))
			result = result.substring(0, result.length() - postfix.length())
		result
	}
}
