package org.xtext.template;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.xtext.template.TextValueConverter;

@SuppressWarnings("all")
public class TemplateValueConverterService extends XbaseValueConverterService {
  @Inject
  private TextValueConverter textValueConverter;
  
  @ValueConverter(rule = "TEXT")
  public IValueConverter<String> TEXT() {
    return this.textValueConverter;
  }
}
