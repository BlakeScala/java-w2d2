import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void place_instantiatesCorrectly_true() {
    CD myCD = new CD("Pearl Jam", "Ten", "1992", "Eddie Vedder and company");
    assertEquals(true, myCD instanceof CD);
  }

  @Test
  public void cd_instantiatesWithArtist_String() {
    CD myCD = new CD("Pearl Jam", "Ten", "1992", "Eddie Vedder and company");
    assertEquals("Pearl Jam", myCD.getArtist());
  }

  @Test
  public void cd_instantiatesWithAlbum_String() {
    CD myCD = new CD("Pearl Jam", "Ten", "1992", "Eddie Vedder and company");
    assertEquals("Ten", myCD.getAlbum());
  }

  @Test
  public void cd_instantiatesWithDesc_String() {
    CD myCD = new CD("Pearl Jam", "Ten", "1992", "Eddie Vedder and company");
    assertEquals("Eddie Vedder and company", myCD.getDescription());
  }

  @Test
  public void cd_instantiatesWithYear_String() {
    CD myCD = new CD("Pearl Jam", "Ten", "1992", "Eddie Vedder and company");
    assertEquals("1992", myCD.getYear());
  }

}
