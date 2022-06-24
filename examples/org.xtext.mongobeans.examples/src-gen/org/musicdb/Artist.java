package org.musicdb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.MongoBeanList;

/**
 * A musical performer
 */
@SuppressWarnings("all")
public class Artist implements IMongoBean {
  /**
   * Creates a new Artist wrapping the given {@link com.mongodb.DBObject}.
   */
  public Artist(final DBObject dbObject) {
    this._dbObject = dbObject;
  }

  /**
   * Creates a new Artist wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public Artist() {
    _dbObject = new BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "org.musicdb.Artist");
  }

  private DBObject _dbObject;

  public DBObject getDbObject() {
    return this._dbObject;
  }

  public String getName() {
    return (String) _dbObject.get("name");
  }

  public void setName(final String name) {
    _dbObject.put("name", name);
  }

  private MongoBeanList<Album> _albums;

  public List<Album> getAlbums() {
    if(_albums==null)
    	_albums = new MongoBeanList<Album>(_dbObject, "albums");
    return _albums;
  }

  public Iterable<? extends Track> getOeuvre() {
    final List<Track> result = new ArrayList<Track>();
    List<Album> _albums = this.getAlbums();
    for (final Album album : _albums) {
      List<Track> _tracks = album.getTracks();
      for (final Track track : _tracks) {
        result.add(track);
      }
    }
    return result;
  }
}
