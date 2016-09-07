import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    int expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForMultiple_1() {
    Scrabble testScrabble = new Scrabble();
    int expected = 12;
    assertEquals(expected, testScrabble.calculateScore("TestWord"));
  }

  @Test
  public void calculateScore_returnsScoreForMultiple_2() {
    Scrabble testScrabble = new Scrabble();
    int expected = 23;
    assertEquals(expected, testScrabble.calculateScore("AAAZQ1"));
  }

  @Test
  public void calculateScore_returnsOnlyNums() {
    Scrabble testScrabble = new Scrabble();
    int expected = 0;
    assertEquals(expected, testScrabble.calculateScore("123456"));
  }

}
