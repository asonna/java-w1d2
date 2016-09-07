
import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter first word: ");
    String firstWord = myConsole.readLine();
    System.out.println("Please enter second word: ");
    String secondWord = myConsole.readLine();



    RockPaperGame newGame = new RockPaperGame();

    String winner = newGame.Game();

    System.out.println("The Winner is " + winner);

  }
}
