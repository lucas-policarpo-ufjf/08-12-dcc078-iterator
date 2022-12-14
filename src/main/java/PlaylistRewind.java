
public class PlaylistRewind {
  public static Music getMostListenedMusic(Playlist playlist) {
    Music mostListedMusic = null;
    for (Music music : playlist) {
      if (mostListedMusic == null || (music.getPlayCount() > mostListedMusic.getPlayCount())) {
        mostListedMusic = music;
      }
    }

    return mostListedMusic;
  }

  public static String getTotalTimeListened(Playlist playlist) {
    Float totalSeconds = 0.0f;
    for (Music music : playlist) {
      totalSeconds += music.getDuration() * music.getPlayCount();
    }

    Integer hours = (int) (totalSeconds / 3600);
    Integer minutes = (int) ((totalSeconds % 3600) / 60);
    Integer seconds = (int) (totalSeconds % 60);

    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }
}
