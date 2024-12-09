import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Adventurer Player = new Reaper("Star", 50, 3);
    Adventurer Enemy = new CodeWarrior("Anaconda", 50, "python");

    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    String action = userInput.nextLine();

    while(!action.equals("quit")){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      action = userInput.nextLine();
    }
  }
}
