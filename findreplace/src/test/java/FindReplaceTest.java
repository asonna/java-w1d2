import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FindReplaceTest {

  @Test
  public void computerChooses_shouldBeAString_true() {
    FindReplace FrObject = new FindReplace();
    String FrMethodResult =  FrObject.FrMethod("hello world", "world", "universe");
    String result = "Hello universe";
    assertEquals(result, FrMethodResult);
  }
}
