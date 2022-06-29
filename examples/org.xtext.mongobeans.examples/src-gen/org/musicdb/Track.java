package org.musicdb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.xtext.mongobeans.examples.Duration;
import org.xtext.mongobeans.lib.IMongoBean;

@SuppressWarnings("all")
public class Track implements IMongoBean {
  /**
   * Creates a new Track wrapping the given {@link com.mongodb.DBObject}.
   */
  public Track(final DBObject dbObject) {
    this._dbObject = dbObject;
  }

  /**
   * Creates a new Track wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public Track() {
    _dbObject = new BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "org.musicdb.Track");
  }

  private DBObject _dbObject;

  public DBObject getDbObject() {
    return this._dbObject;
  }

  public String getTitle() {
    return (String) _dbObject.get("title");
  }

  public void setTitle(final String title) {
    _dbObject.put("title", title);
  }

  public int getSeconds() {
    return (Integer) _dbObject.get("seconds");
  }

  public void setSeconds(final int seconds) {
    _dbObject.put("seconds", seconds);
  }

  public Duration getDuration() {
    int _seconds = this.getSeconds();
    return new Duration(_seconds);
  }
}
