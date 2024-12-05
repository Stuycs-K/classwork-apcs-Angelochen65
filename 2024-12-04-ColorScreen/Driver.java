public class Driver{
  public static void bordWidth(){
    for(int i = 0; i < 80; i++){
      Text.color(Text.background(Text.GREEN));
      System.out.print(" ");
    }

  }

  //Make 80 * 30 border
  public static void main(String[] args) {
    bordWidth();
    System.out.println(Text.RESET);
    for(int i = 0; i < 30; i++){
      Text.color(Text.background(Text.GREEN));
      System.out.print(" ");

      for(int a = 0; a < 78; a++){
        System.out.print(Text.RESET + " ");
      }
      Text.color(Text.background(Text.GREEN));
      System.out.print(" ");
      System.out.println(Text.RESET);

    }
    bordWidth();



    System.out.print(Text.RESET);

  }

}
