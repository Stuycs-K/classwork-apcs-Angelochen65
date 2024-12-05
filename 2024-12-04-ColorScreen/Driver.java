import java.util.Arrays;

public class Driver{
  public static void bordWidth(){
    for(int i = 0; i < 80; i++){
      Text.color(Text.background(Text.GREEN));
      System.out.print(" ");
    }

  }

  public static void numColor(int num){
    if(num < 25){
      Text.color(Text.RED, Text.BRIGHT);
    }
    else if(num > 75){
      Text.color(Text.GREEN, Text.BRIGHT);
    }
    else{
      Text.color(Text.WHITE);
    }

  }

  public static void separators(){
    for(int i = 0; i < 78;i++){
      Text.color(Text.GREEN);
      System.out.print("-");
    }
  }


  public static void main(String[] args) {
    //Make 80 * 30 border
    bordWidth();
    System.out.println(Text.RESET);
    for(int i = 0; i < 28; i++){
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

    //Array in top 3
    System.out.print(Text.RESET);
    int[] colorful = {(int)(Math.random()* 99),(int)(Math.random()* 99),(int)(Math.random()* 99)};
    Text.go(3,20);
    numColor(colorful[0]);
    System.out.print(colorful[0]);
    Text.go(3,40);
    numColor(colorful[1]);
    System.out.print(colorful[1]);
    Text.go(3,60);
    numColor(colorful[2]);
    System.out.print(colorful[2]);

    //Separator
    Text.go(4,2);
    separators();







    System.out.print(Text.RESET);
    Text.go(31,2);


  }

}
