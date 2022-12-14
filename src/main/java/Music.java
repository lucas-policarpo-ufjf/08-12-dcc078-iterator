public class Music {
  private String name;
  private String artist;
  private Float duration; // seconds
  private Integer playCount;

  public Music(String name, String artist, Float duration, Integer playCount) {
    this.name = name;
    this.artist = artist;
    this.duration = duration;
    this.playCount = playCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public Float getDuration() {
    return duration;
  }

  public void setDuration(Float duration) {
    this.duration = duration;
  }

  public Integer getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Integer playCount) {
    this.playCount = playCount;
  }

  @Override
  public String toString() {
    return "Music [name=" + name + ", artist=" + artist + ", duration=" + duration + ", playCount=" + playCount + "]";
  }

}
