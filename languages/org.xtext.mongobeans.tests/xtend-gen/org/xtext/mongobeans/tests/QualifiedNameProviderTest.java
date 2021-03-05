/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.tests;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoFile;

@RunWith(XtextRunner.class)
@InjectWith(MongoBeansInjectorProvider.class)
@SuppressWarnings("all")
public class QualifiedNameProviderTest {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private ParseHelper<MongoFile> _parseHelper;
  
  @Test
  public void testQualifiedName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package pkg {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Bar {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} bar");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Iterator<MongoBean> beans = Iterators.<MongoBean>filter(this._parseHelper.parse(_builder).eAllContents(), MongoBean.class);
      Assert.assertEquals(QualifiedName.create("pkg", "Foo"), this._iQualifiedNameProvider.getFullyQualifiedName(IteratorExtensions.<MongoBean>head(beans)));
      Assert.assertEquals(QualifiedName.create("pkg", "Bar"), this._iQualifiedNameProvider.getFullyQualifiedName(IteratorExtensions.<MongoBean>last(beans)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
