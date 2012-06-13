package org.xtext.mongobeans;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import org.xtext.mongobeans.IMongoBean;
import org.xtext.mongobeans.WrappingUtil;

@SuppressWarnings("all")
public class MongoExtensions {
  public <T extends IMongoBean> T findOne(final DBCollection collection, final T wrapper) {
    DBObject _dbObject = wrapper.getDbObject();
    DBObject _findOne = collection.findOne(_dbObject);
    IMongoBean _wrap = _findOne==null?(IMongoBean)null:WrappingUtil.wrap(_findOne);
    return ((T) _wrap);
  }
  
  public WriteResult save(final DBCollection collection, final IMongoBean wrapper) {
    DBObject _dbObject = wrapper.getDbObject();
    WriteResult _save = collection.save(_dbObject);
    return _save;
  }
}
