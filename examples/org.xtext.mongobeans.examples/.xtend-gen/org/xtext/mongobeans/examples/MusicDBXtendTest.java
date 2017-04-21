/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.examples;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.musicdb.Album;
import org.musicdb.Artist;
import org.musicdb.Track;
import org.xtext.mongobeans.examples.Duration;
import org.xtext.mongobeans.lib.MongoExtensions;

@SuppressWarnings("all")
public class MusicDBXtendTest {
  @Extension
  private MongoExtensions _mongoExtensions = new MongoExtensions();
  
  @Test
  public void testMongoFacade() {
    try {
      final Mongo mongo = new Mongo();
      try {
        final DB db = mongo.getDB("testdb");
        final DBCollection dbCollection = db.getCollection("testCollection");
        Artist _artist = new Artist();
        final Procedure1<Artist> _function = (Artist it) -> {
          it.setName("John Coltrane");
          final Procedure1<Album> _function_1 = (Album it_1) -> {
            it_1.setTitle("A Love Supreme");
            it_1.setYear(1965);
            this.addTrack(it_1, "Part 1: Acknowledgement", "7:43");
            this.addTrack(it_1, "Part 2: Resolution", "7:20");
            this.addTrack(it_1, "Part 3: Pursuance", "10:42");
            this.addTrack(it_1, "Part 4: Psalm", "7:05");
          };
          this.addAlbum(it, _function_1);
          final Procedure1<Album> _function_2 = (Album it_1) -> {
            it_1.setTitle("Impressions");
            it_1.setYear(1961);
            this.addTrack(it_1, "India", "13:52");
            this.addTrack(it_1, "Up \'gainst the Wall", "3:12");
            this.addTrack(it_1, "Impressions", "14:40");
            this.addTrack(it_1, "After the Rain", "4:07");
          };
          this.addAlbum(it, _function_2);
        };
        final Artist john = ObjectExtensions.<Artist>operator_doubleArrow(_artist, _function);
        Assert.assertEquals(8, IterableExtensions.size(john.getOeuvre()));
        this._mongoExtensions.save(dbCollection, john);
        Artist _artist_1 = new Artist();
        final Procedure1<Artist> _function_1 = (Artist it) -> {
          it.setName("John Coltrane");
        };
        Artist _doubleArrow = ObjectExtensions.<Artist>operator_doubleArrow(_artist_1, _function_1);
        final Artist johnFromDb = this._mongoExtensions.<Artist>findOneBean(dbCollection, _doubleArrow);
        Assert.assertNotNull(johnFromDb);
        Assert.assertEquals(2, johnFromDb.getAlbums().size());
        final Album albumFromDb = johnFromDb.getAlbums().get(1);
        Assert.assertEquals("35:51", albumFromDb.getDuration().toString());
      } finally {
        mongo.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected boolean addAlbum(final Artist it, final Procedure1<? super Album> initializer) {
    List<Album> _albums = it.getAlbums();
    Album _album = new Album();
    Album _doubleArrow = ObjectExtensions.<Album>operator_doubleArrow(_album, initializer);
    return _albums.add(_doubleArrow);
  }
  
  protected boolean addTrack(final Album it, final String trackTitle, final String trackDuration) {
    List<Track> _tracks = it.getTracks();
    Track _track = new Track();
    final Procedure1<Track> _function = (Track it_1) -> {
      it_1.setTitle(trackTitle);
      it_1.setSeconds(new Duration(trackDuration).getSeconds());
    };
    Track _doubleArrow = ObjectExtensions.<Track>operator_doubleArrow(_track, _function);
    return _tracks.add(_doubleArrow);
  }
}
