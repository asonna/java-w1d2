import java.util.ArrayList;
import java.util.List;
import java.io.Console;
import java.util.Random;
import java.util.Arrays;

public class RockPaperGame {
  Console myConsole = System.console();

  public String Game(){
    String Player1 = "Player 1";
    String Player2 = "Player 2";
    String result1;
    String result2;
    String winner = "none";

    System.out.println("Please choose Human or Computer for Player 2");
    String playerChoice = myConsole.readLine();

    do {
       result1 = PlayerChoose(Player1);

      if(playerChoice.equals("Human"))
        result2 = PlayerChoose(Player2);
      else{
        result2 = ComputerChoose();
        System.out.println("Computer Chooses " + result2);
        Player2 = "Computer";
      }

      if(result1.equals(result2)){
        System.out.println("Tie, try again.");
      }
      else if(result1.equals("rock")){
          if(result2.equals("paper"))
            winner = Player2;
          else //Player2 is Scissors
            winner = Player1;
      }
      else if(result1.equals("paper")){
          if(result2.equals("scissors"))
            winner = Player2;
          else //Player2 is Rock
            winner = Player1;
      }
      else if(result1.equals("scissors")){
          if(result2.equals("rock"))
            winner = Player2;
          else //Player2 is Paper
            winner = Player1;
      }

    } while(winner.equals("none"));

    return(winner);
  }


  public String PlayerChoose(String playerName) {
    List<String> valid = Arrays.asList("rock", "paper", "scissors");
    String playerChoice;

    boolean test = true;
    do{
      System.out.println(playerName + " Please choose Rock, Paper or Scissors: ");
      playerChoice = myConsole.readLine().toLowerCase();

      if (valid.contains(playerChoice)) {
        test = false;
      } else {
        System.out.println(playerName + "Invalid Choice, try again.");
      }
    } while(test);

    return(playerChoice);
  }

  public String ComputerChoose(){

    Random rand = new Random();
    int  n = rand.nextInt(3);
    if(n==0)
      return("Rock");
    else if(n==1)
      return("Paper");
    else
      return("Scissors");
  }
}
