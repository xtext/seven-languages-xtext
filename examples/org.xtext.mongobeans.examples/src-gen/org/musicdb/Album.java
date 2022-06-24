package org.musicdb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.mongobeans.examples.Duration;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.MongoBeanList;

@SuppressWarnings("all")
public class Album implements IMongoBean {
  /**
   * Creates a new Album wrapping the given {@link com.mongodb.DBObject}.
   */
  public Album(final DBObject dbObject) {
    this._dbObject = dbObject;
  }

  /**
   * Creates a new Album wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public Album() {
    _dbObject = new BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "org.musicdb.Album");
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

  public int getYear() {
    return (Integer) _dbObject.get("year");
  }

  public void setYear(final int year) {
    _dbObject.put("year", year);
  }

  public Duration getDuration() {
    final Function1<Track, Duration> _function = (Track it) -> {
      return it.getDuration();
    };
    final Function2<Duration, Duration, Duration> _function_1 = (Duration a, Duration b) -> {
      return a.operator_plus(b);
    };
    return IterableExtensions.<Duration>reduce(ListExtensions.<Track, Duration>map(this.getTracks(), _function), _function_1);
  }

  private MongoBeanList<Track> _tracks;

  public List<Track> getTracks() {
    if(_tracks==null)
    	_tracks = new MongoBeanList<Track>(_dbObject, "tracks");
    return _tracks;
  }
}
