
import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    FindReplace FrObject = new FindReplace();

    String Output = FrObject.FrMethod();

    System.out.println(Output);

  }
}
