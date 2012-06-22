package org.xtext.cradle.valueconversion

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService

class CradleValueConverter extends XbaseValueConverterService {
	
	@Inject FILEValueConverter FILE
	
    @ValueConverter(rule = "FILE")
	def IValueConverter<String> getFILE() {
		FILE;
	}	
}

class FILEValueConverter implements IValueConverter {
	override toString(Object value) { 
		":/" + value + " " 
	}
	override toValue(String string, INode node) {
		if(string.nullOrEmpty)
			null
		else {
			var trimmed = string.trim
			if(trimmed.endsWith(":"))
				trimmed = trimmed.substring(0, trimmed.length - 1)
			trimmed.substring(2, trimmed.length)
		}
	}
}