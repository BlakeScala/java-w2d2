public class CD {

  private String mArtist;
  private String mAlbum;
  private String mYear;
  private String mDescription;

  public CD(String _artist, String _album, String _year, String _description) {
    mArtist = _artist;
    mAlbum = _album;
    mYear = _year;
    mDescription = _description;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getArtist() {
    return mArtist;
  }

  public String getYear() {
    return mYear;
  }

  public String getAlbum() {
    return mAlbum;
  }

}
