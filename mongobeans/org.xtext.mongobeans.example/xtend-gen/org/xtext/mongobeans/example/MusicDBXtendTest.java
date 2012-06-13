package org.xtext.mongobeans.example;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.musicdb.Album;
import org.musicdb.Artist;
import org.musicdb.Track;
import org.xtext.mongobeans.MongoExtensions;
import org.xtext.mongobeans.example.Duration;

@SuppressWarnings("all")
public class MusicDBXtendTest {
  private MongoExtensions _mongoExtensions = new Function0<MongoExtensions>() {
    public MongoExtensions apply() {
      MongoExtensions _mongoExtensions = new MongoExtensions();
      return _mongoExtensions;
    }
  }.apply();
  
  @Test
  public void testMongoFacade() {
    try {
      Mongo _mongo = new Mongo();
      final Mongo mongo = _mongo;
      try {
        final DB db = mongo.getDB("testdb");
        final DBCollection dbCollection = db.getCollection("testCollection");
        Artist _artist = new Artist();
        final Procedure1<Artist> _function = new Procedure1<Artist>() {
            public void apply(final Artist it) {
              it.setName("John Coltrane");
              final Procedure1<Album> _function = new Procedure1<Album>() {
                  public void apply(final Album it) {
                    it.setTitle("A Love Supreme");
                    it.setYear(1965);
                    MusicDBXtendTest.this.addTrack(it, "Part 1: Acknowledgement", "7:43");
                    MusicDBXtendTest.this.addTrack(it, "Part 2: Resolution", "7:20");
                    MusicDBXtendTest.this.addTrack(it, "Part 3: Pursuance", "10:42");
                    MusicDBXtendTest.this.addTrack(it, "Part 4: Psalm", "7:05");
                  }
                };
              MusicDBXtendTest.this.addAlbum(it, _function);
              final Procedure1<Album> _function_1 = new Procedure1<Album>() {
                  public void apply(final Album it) {
                    it.setTitle("Impressions");
                    it.setYear(1961);
                    MusicDBXtendTest.this.addTrack(it, "India", "13:52");
                    MusicDBXtendTest.this.addTrack(it, "Up \'gainst the Wall", "3:12");
                    MusicDBXtendTest.this.addTrack(it, "Impressions", "14:40");
                    MusicDBXtendTest.this.addTrack(it, "After the Rain", "4:07");
                  }
                };
              MusicDBXtendTest.this.addAlbum(it, _function_1);
            }
          };
        final Artist john = ObjectExtensions.<Artist>operator_doubleArrow(_artist, _function);
        Iterable<Track> _oevre = john.getOevre();
        int _size = IterableExtensions.size(_oevre);
        Assert.assertEquals(8, _size);
        this._mongoExtensions.save(dbCollection, john);
        Artist _artist_1 = new Artist();
        final Procedure1<Artist> _function_1 = new Procedure1<Artist>() {
            public void apply(final Artist it) {
              it.setName("John Coltrane");
            }
          };
        Artist _doubleArrow = ObjectExtensions.<Artist>operator_doubleArrow(_artist_1, _function_1);
        final Artist johnFromDb = this._mongoExtensions.<Artist>findOne(dbCollection, _doubleArrow);
        Assert.assertNotNull(johnFromDb);
        List<Album> _albums = johnFromDb.getAlbums();
        int _size_1 = _albums.size();
        Assert.assertEquals(2, _size_1);
        List<Album> _albums_1 = johnFromDb.getAlbums();
        final Album albumFromDb = _albums_1.get(1);
        Duration _duration = albumFromDb.getDuration();
        String _string = _duration.toString();
        Assert.assertEquals("35:51", _string);
      } finally {
        mongo.close();
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected boolean addAlbum(final Artist it, final Procedure1<? super Album> initializer) {
    List<Album> _albums = it.getAlbums();
    Album _album = new Album();
    Album _doubleArrow = ObjectExtensions.<Album>operator_doubleArrow(_album, initializer);
    boolean _add = _albums.add(_doubleArrow);
    return _add;
  }
  
  protected boolean addTrack(final Album it, final String trackTitle, final String trackDuration) {
    List<Track> _tracks = it.getTracks();
    Track _track = new Track();
    final Procedure1<Track> _function = new Procedure1<Track>() {
        public void apply(final Track it) {
          it.setTitle(trackTitle);
          Duration _duration = new Duration(trackDuration);
          int _seconds = _duration.getSeconds();
          it.setSeconds(_seconds);
        }
      };
    Track _doubleArrow = ObjectExtensions.<Track>operator_doubleArrow(_track, _function);
    boolean _add = _tracks.add(_doubleArrow);
    return _add;
  }
}
