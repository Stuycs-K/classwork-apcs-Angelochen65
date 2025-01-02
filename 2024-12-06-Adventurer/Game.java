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
    String username = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + username);
    String action = "";
    String[] EnemyActions = {"a", "sp", "su"};
    int EA;
    String acc;


    while(Player.getHP() > 0 && Enemy.getHP() > 0){
      /*Conan, 5/16 HP, 19/20 Rage */

      System.out.println(username + " " + Player.getHP() + "/" + Player.getmaxHP() + "HP," + Player.getSpecial() + "/" + Player.getSpecialMax() + " " + Player.getSpecialName() );
      System.out.println(Enemy.getName() + " " + Enemy.getHP() + "/" + Enemy.getmaxHP() + "HP," + Enemy.getSpecial() + "/" + Enemy.getSpecialMax() + " " + Enemy.getSpecialName() );
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      action = userInput.nextLine();
      while(!action.equals("a") && !action.equals("sp") && !action.equals("su") && !action.equals("quit")){
        System.out.println("Invalid Response!");
        action = userInput.nextLine();
      }
      if(action.equals("quit")){
        System.exit(1);
      }
      if(action.equals("a")){
        System.out.println(username + " used their attack on Anaconda!");
        Player.attack(Enemy);

      }
      else if(action.equals("sp")){
        Player.specialAttack(Enemy);
        System.out.println(username + " used their special attack on Anaconda!");
      }
      else if(action.equals("su")){
        Player.support();
        System.out.println(username + " healed themself!");
      }
      System.out.println("\n");
      EA = (int)(Math.random() * 3);
      acc = EnemyActions[EA];
      if(acc.equals("a")){
        Enemy.attack(Player);
        System.out.println("Anaconda used their attack on " + username + "!");

      }
      else if(acc.equals("sp")){
        Enemy.specialAttack(Player);
        System.out.println("Anaconda used their special attack on " + username + "!");
      }
      else if(acc.equals("su")){
        Enemy.support();
        System.out.println("Anaconda healed themself!");
      }


    }
  }
}
