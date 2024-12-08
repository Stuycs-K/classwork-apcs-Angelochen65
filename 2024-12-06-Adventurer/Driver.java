public class Driver{
  public static void main(String[] args) {
    Adventurer John = new Reaper("John");
    Adventurer Joseph = new Reaper("Joseph", 20, 10);
    Adventurer Jacob = new Reaper("Jacob", 30, 7);

    System.out.println(Joseph.getSpecialName());
    System.out.println(Jacob.getSpecialName() + "\n");
    System.out.println(Joseph.attack(Jacob) + " should be 25");
    System.out.println(Jacob.attack(Joseph) + " should be 15 ");
    System.out.println(Jacob.support(Joseph) + " should be 20");
    System.out.println(Jacob.support() + " should be 30");
    System.out.println(Joseph.specialAttack(Jacob) + " should be 5 and 9");
    System.out.println(Jacob.specialAttack(Joseph) + " should be 1 and 6");
    System.out.println(Jacob.restoreSpecial(12) + " should be 1");
    System.out.println(Jacob.getSpecial() + " should be 7");


  }

}
