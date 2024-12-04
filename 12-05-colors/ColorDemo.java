public class ColorDemo{
  public static int GREEN = 32;
  public static int LGREEN = 92;

  public static void color(int foreground,int background){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
}

  public static void color(int foreground, int background, int modifier){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) +  ";" + modifier + "m");
}

public static void go(int r,int c){
  System.out.print("\u001b[" + r + ";" + c + "f");
}
  public static void main(String[] args){

    //     for(int r = 0; r < 256; r+=12){
    //   for(int g = 0; g <= 256; g+=42){
    //     for(int b = 0; b <= 256; b+=12){
    //       System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    //     }
    //   }
    //     System.out.println();
    // }

    int space = 50;
    int tree = 1;
    while(space >= 40){
      for(int i = 0; i < space; i++){
        System.out.print("\u001b[0m ");

      }
      color(0, GREEN);

      for(int a = 0; a < tree; a++){
        System.out.print("  ");
      }
      System.out.println("\u001b[0m");
      tree+=2;
      space -= 2;

    }
    space +=4;
    tree-=4;
    while(space >= 30){
      for(int i = 0; i < space; i++){
        System.out.print("\u001b[0m ");

      }
      color(0, GREEN);

      for(int a = 0; a < tree; a++){
        System.out.print("  ");
      }
      System.out.println("\u001b[0m");
      tree+=2;
      space -= 2;

    }
    space +=4;
    tree-=4;
    while(space >= 20){
      for(int i = 0; i < space; i++){
        System.out.print("\u001b[0m ");

      }
      color(0, GREEN);

      for(int a = 0; a < tree; a++){
        System.out.print("  ");
      }
      System.out.println("\u001b[0m");
      tree+=2;
      space -= 2;

    }

    System.out.println("\u001b[0m");

  }
}
