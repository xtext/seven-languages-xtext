/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.musicdb;

import com.google.common.collect.Iterables;
import com.mongodb.DBObject;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.musicdb.Album;
import org.musicdb.Track;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.MongoBeanList;

/**
 * A musical performer
 */
public class Artist implements IMongoBean {
  /**
   * Creates a new Artist wrapping the given {@link DBObject}.
   */
  public Artist(final DBObject dbObject) {
    this._dbObject = dbObject;
    
  }
  
  /**
   * Creates a new Artist wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public Artist() {
    _dbObject = new com.mongodb.BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "org.musicdb.Artist");
    
  }
  
  private DBObject _dbObject;
  
  public DBObject getDbObject() {
    return this._dbObject;
  }
  
  public String getName() {
    return (java.lang.String) _dbObject.get("name");
    
  }
  
  public void setName(final String name) {
    _dbObject.put("name", name);
    
  }
  
  private MongoBeanList<Album> _albums;
  
  public List<Album> getAlbums() {
    if(_albums==null)
    	_albums = new org.xtext.mongobeans.lib.MongoBeanList<org.musicdb.Album>(_dbObject, "albums");
    return _albums;
    
  }
  
  public Iterable<Track> getOevre() {
    List<Album> _albums = this.getAlbums();
    final Function1<Album,List<Track>> _function = new Function1<Album,List<Track>>() {
        public List<Track> apply(final Album it) {
          List<Track> _tracks = it.getTracks();
          return _tracks;
        }
      };
    List<List<Track>> _map = ListExtensions.<Album, List<Track>>map(_albums, _function);
    Iterable<Track> _flatten = Iterables.<Track>concat(_map);
    return _flatten;
  }
}
