public class ColorDemo{
  public static int GREEN = 32;
  public static int LGREEN = 92;

  public static void color(int foreground,int background){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
}

  public static void main(String[] args){
    int space = 50;
    int tree = 1;
    int random;
    for(int i = 0; i < space; i++){
      System.out.print("\u001b[0m ");

    }
      color(0, 33);
    System.out.print("  ");
    System.out.println("\u001b[0m");
    for(int i = 0; i < space-2; i++){
      System.out.print("\u001b[0m ");

    }
    color(0, 33);
    System.out.print("      ");
    System.out.println("\u001b[0m");
    for(int i = 0; i < space; i++){
      System.out.print("\u001b[0m ");

    }
    color(0, 33);
    System.out.print("  ");
    System.out.println("\u001b[0m");



    while(space >= 40){
      for(int i = 0; i < space; i++){
        System.out.print("\u001b[0m ");

      }
      color(0, GREEN);

      for(int a = 0; a < tree; a++){
        random = (int) (Math.random() * 10);
        if(random < 9){
          color(0, GREEN);
        }
        else{
          color(0, 37);
        }
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

      for(int a = 0; a < tree; a++){
        random = (int) (Math.random() * 10);
        if(random < 9){
          color(0, GREEN);
        }
        else{
          color(0, 36);
        }
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

      for(int a = 0; a < tree; a++){
        random = (int) (Math.random() * 10);
        if(random < 9){
          color(0, GREEN);
        }
        else{
          color(0, 34);
        }

        System.out.print("  ");
      }
      System.out.println("\u001b[0m");
      tree+=2;
      space -= 2;

    }
    space=47;

    for(int a = 0; a < 7; a++){
      for(int i = 0; i < space; i++){
        System.out.print("\u001b[0m ");

      }
      for(int i = 0; i < 7; i++){
        System.out.print("\u001b[48;2;76;43;42m ");
      }
      System.out.println("\u001b[0m");

    }

    System.out.println("\u001b[0m");

  }
}
