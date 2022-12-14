import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Music> {
  private List<Music> musics = new ArrayList<Music>();

  public Playlist(Music... musics) {
    this.musics = Arrays.asList(musics);
  }

  @Override
  public Iterator<Music> iterator() {
    return musics.iterator();
  }
}
