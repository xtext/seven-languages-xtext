package org.xtext.template

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.STRINGValueConverter
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService
import org.eclipse.xtext.util.Strings

class TemplateValueConverterService extends XbaseValueConverterService {

	@Inject TextValueConverter textValueConverter
	
	@ValueConverter(rule = "TEXT")
	def IValueConverter<String> TEXT() {
		return textValueConverter;
	}

}

/**
 * removes the surrounding terminals in template text
 */
class TextValueConverter extends STRINGValueConverter {
	override protected toEscapedString(String value) {
		'»' + Strings::convertToJavaString(value, false) + '«'
	}		
}
