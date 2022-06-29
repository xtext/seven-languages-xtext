/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.lib;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

/**
 * Example wrapper methods for DB interaction.
 */
@SuppressWarnings("all")
public class MongoExtensions {
  public <T extends IMongoBean> T findOneBean(final DBCollection collection, final T wrapper) {
    DBObject _findOne = collection.findOne(wrapper.getDbObject());
    IMongoBean _wrap = null;
    if (_findOne!=null) {
      _wrap=WrappingUtil.wrap(_findOne);
    }
    return ((T) _wrap);
  }

  public WriteResult save(final DBCollection collection, final IMongoBean wrapper) {
    return collection.save(wrapper.getDbObject());
  }
}
