package org.xtext.template;

import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.template.TextValueConverter;

@SuppressWarnings("all")
public class TemplateValueConverterService extends XbaseValueConverterService {
  private final TextValueConverter exp2exp = new Function0<TextValueConverter>() {
    public TextValueConverter apply() {
      TextValueConverter _textValueConverter = new TextValueConverter("?>", "<?");
      return _textValueConverter;
    }
  }.apply();
  
  private final TextValueConverter exp2stm = new Function0<TextValueConverter>() {
    public TextValueConverter apply() {
      TextValueConverter _textValueConverter = new TextValueConverter("?>", "<%");
      return _textValueConverter;
    }
  }.apply();
  
  private final TextValueConverter stm2exp = new Function0<TextValueConverter>() {
    public TextValueConverter apply() {
      TextValueConverter _textValueConverter = new TextValueConverter("%>", "<?");
      return _textValueConverter;
    }
  }.apply();
  
  private final TextValueConverter stm2stm = new Function0<TextValueConverter>() {
    public TextValueConverter apply() {
      TextValueConverter _textValueConverter = new TextValueConverter("%>", "<%");
      return _textValueConverter;
    }
  }.apply();
  
  @ValueConverter(rule = "TEXT_EXP2EXP")
  public TextValueConverter getTEXT_EXP2EXPValueConverter() {
    return this.exp2exp;
  }
  
  @ValueConverter(rule = "TEXT_EXP2STM")
  public TextValueConverter getTEXT_EXP2STMValueConverter() {
    return this.exp2stm;
  }
  
  @ValueConverter(rule = "TEXT_STM2EXP")
  public TextValueConverter getTEXT_STM2EXPValueConverter() {
    return this.stm2exp;
  }
  
  @ValueConverter(rule = "TEXT_STM2STM")
  public TextValueConverter getTEXT_STM2STMValueConverter() {
    return this.stm2stm;
  }
}
