import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class RockPaperTest {

  @Test
  public void computerChooses_shouldBeAString_true() {
    RockPaperGame testGame = new RockPaperGame();
    String computerChoice =  testGame.ComputerChoose();
    assertEquals(true, computerChoice instanceof String);
  }

}
