package org.xtext.builddsl.valueconversion;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.xtext.builddsl.valueconversion.FILEValueConverter;

@SuppressWarnings("all")
public class BuildDSLValueConverter extends XbaseValueConverterService {
  @Inject
  private FILEValueConverter FILE;
  
  @ValueConverter(rule = "FILE")
  public IValueConverter<String> getFILE() {
    return this.FILE;
  }
}
