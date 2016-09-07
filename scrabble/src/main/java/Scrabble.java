import java.util.ArrayList;
import java.util.List;

public class Scrabble {


  public int calculateScore(String word){

    int score = 0;

    String[] wordArray = word.split("");

    //String[] letter1 = {"A","E","I","O","U","L","N","R","S","T"};

    for(int i=0; i<wordArray.length; ++i){

       String letter = wordArray[i].toUpperCase();

        if(letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U") || letter.equals("L") || letter.equals("N") || letter.equals("R") || letter.equals("S") || letter.equals("T") ){
          ++score;
        }
        else if (letter.equals("D") || letter.equals("G") ){
         score = score + 2;
        }
        else if (letter.equals("B") || letter.equals("C") || letter.equals("M") || letter.equals("P") ){
        score = score + 3;
        }
        else if (letter.equals("F") || letter.equals("H") || letter.equals("V") || letter.equals("W") || letter.equals("Y") ){
          score = score + 4;
        }
        else if (letter.equals("K") ){
          score = score + 5;
        }
        else if (letter.equals("J") || letter.equals("X") ){
          score = score + 8;
        }
        else if (letter.equals("Q") || letter.equals("Z") ){
          score = score + 10;
        }
     }
     System.out.println("Score: " + score);
     return(score);
  }
}
