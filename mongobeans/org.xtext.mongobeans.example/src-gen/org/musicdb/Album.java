package org.musicdb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.musicdb.Track;
import org.xtext.mongobeans.IMongoBean;
import org.xtext.mongobeans.MongoBeanList;
import org.xtext.mongobeans.example.Duration;

public class Album implements IMongoBean {
  /**
   * Creates a new Album wrapping the given {@link DBObject}.
   */
  public Album(final DBObject dbObject) {
    this._dbObject = dbObject;
  }
  
  /**
   * Creates a new Album wrapping a new {@link BasicDBObject}.
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
    List<Track> _tracks = this.getTracks();
    final Function1<Track,Duration> _function = new Function1<Track,Duration>() {
        public Duration apply(final Track it) {
          Duration _duration = it.getDuration();
          return _duration;
        }
      };
    List<Duration> _map = ListExtensions.<Track, Duration>map(_tracks, _function);
    final Function2<Duration,Duration,Duration> _function_1 = new Function2<Duration,Duration,Duration>() {
        public Duration apply(final Duration a, final Duration b) {
          Duration _plus = a.operator_plus(b);
          return _plus;
        }
      };
    Duration _reduce = IterableExtensions.<Duration>reduce(_map, _function_1);
    return _reduce;
  }
  
  private MongoBeanList<Track> _tracks;
  
  public List<Track> getTracks() {
    if(_tracks==null)
    	_tracks = new MongoBeanList<Track>(_dbObject, "tracks");
    return _tracks;
  }
}
