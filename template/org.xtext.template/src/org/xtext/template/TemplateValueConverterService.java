package org.xtext.template;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

public class TemplateValueConverterService extends XbaseValueConverterService {

	private static class TextValueConverter extends AbstractValueConverter<String> {
		private String postfix;
		private String prefix;

		private TextValueConverter(String prefix, String postfix) {
			super();
			this.prefix = prefix;
			this.postfix = postfix;
		}

		@Override
		public String toString(String value) {
			String infix = value == null ? "" : value;
			return prefix + infix + postfix;
		}

		@Override
		public String toValue(String string, INode node) throws ValueConverterException {
			if (string == null)
				return null;
			if (string.startsWith(prefix))
				string = string.substring(prefix.length());
			if (string.endsWith(postfix))
				string = string.substring(0, string.length() - postfix.length());
			return string;
		}
	}

	private TextValueConverter exp2exp = new TextValueConverter("?>", "<?");
	private TextValueConverter exp2stm = new TextValueConverter("?>", "<%");
	private TextValueConverter stm2exp = new TextValueConverter("%>", "<?");
	private TextValueConverter stm2stm = new TextValueConverter("%>", "<%");

	@ValueConverter(rule = "TEXT_EXP2EXP")
	public IValueConverter<String> getTEXT_EXP2EXPValueConverter() {
		return exp2exp;
	}

	@ValueConverter(rule = "TEXT_EXP2STM")
	public IValueConverter<String> getTEXT_EXP2STMValueConverter() {
		return exp2stm;
	}

	@ValueConverter(rule = "TEXT_STM2EXP")
	public IValueConverter<String> getTEXT_STM2EXPValueConverter() {
		return stm2exp;
	}

	@ValueConverter(rule = "TEXT_STM2STM")
	public IValueConverter<String> getTEXT_STM2STMValueConverter() {
		return stm2stm;
	}

}
