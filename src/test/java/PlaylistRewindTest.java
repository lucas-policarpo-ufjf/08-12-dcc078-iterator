import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistRewindTest {

    @Test
    void shouldGetTheMostListenedMusicCorrectly() {
        Playlist playlist = new Playlist(
                new Music("Go get it", "Slowdive", 500f, 22),
                new Music("Untruth", "Hammock", 600f, 7),
                new Music("Lost Kitten", "Metric", 300f, 5),
                new Music("Angel", "The weeknd", 280f, 11));

        assertEquals("Music [name=Go get it, artist=Slowdive, duration=500.0, playCount=22]",
                PlaylistRewind.getMostListenedMusic(playlist).toString());
    }

    @Test
    void shouldGetTheTotalTimeListened() {
        Playlist playlist = new Playlist(
                new Music("Go get it", "Slowdive", 500f, 22),
                new Music("Angel", "The weeknd", 280f, 11));

        assertEquals("03:54:40", PlaylistRewind.getTotalTimeListened(playlist));
    }
}