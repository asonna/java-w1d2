
import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String scrabbleWord;

    do {
      Scrabble testScrabble = new Scrabble();

      System.out.println("Please enter a scrabble word: ");
      scrabbleWord = myConsole.readLine();
      testScrabble.calculateScore(scrabbleWord);
    } while(!scrabbleWord.equals("EXIT"));
    
  }
}
