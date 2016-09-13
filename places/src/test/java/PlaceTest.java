import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {

  @Test
  public void place_instantiatesCorrectly_true() {
    Place myPlace = new Place("Portland", "Oregon");
    assertEquals(true, myPlace instanceof Place);
  }

  @Test
  public void place_instantiatesWithDescription_String() {
    Place myPlace = new Place("Portland", "Oregon");
    assertEquals("Oregon", myPlace.getDescription());
  }

  @Test
  public void place_instantiatesWithName_String() {
    Place myPlace = new Place("Portland", "Oregon");
    assertEquals("Portland", myPlace.getName());
  }

}
