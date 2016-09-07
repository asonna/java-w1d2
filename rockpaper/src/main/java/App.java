
import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    RockPaperGame newGame = new RockPaperGame();

    String winner = newGame.Game();

    System.out.println("The Winner is " + winner);

  }
}
