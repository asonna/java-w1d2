import java.util.ArrayList;
import java.util.List;
import java.io.Console;
import java.util.Random;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindReplace {
  Console myConsole = System.console();


public String FrMethod(){
  Pattern pattern = Pattern.compile("World");

  String input = "Hello World, save the World";
       Matcher matcher = pattern.matcher(input);
       StringBuffer sb= new StringBuffer();

   while (matcher.find()) {
               matcher.appendReplacement(sb, "Universe");
    }
   matcher.appendTail(sb);
  System.out.println("Input : " + input);
  System.out.println("Output: " + sb.toString());
        return("");
    }

  }
