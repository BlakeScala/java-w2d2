import org.junit.*;
import static org.junit.Assert.*;

public class ResumeTest {

  @Test
  public void resume_instantiatesCorrectly_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals(true, job instanceof Resume);
  }

  @Test
  public void resume_instantiatesWithPosition_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals("Crew", job.getPosition());
  }

  @Test
  public void resume_instantiatesWithCompanyName_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals("Joe's Food", job.getCompanyName());
  }

  @Test
  public void resume_instantiatesWithCompanyLocation_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals("Georgia", job.getCompanyLocation());
  }

  @Test
  public void resume_instantiatesWithDescription_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals("Made fries", job.getDescription());
  }

  @Test
  public void resume_instantiatesWithDatesOfEmployment_string() {
    Resume job = new Resume("Crew", "Joe's Food", "Georgia", "Made fries", "Last week -- present");
    assertEquals("Last week -- present", job.getDatesOfEmployment());
  }
}
