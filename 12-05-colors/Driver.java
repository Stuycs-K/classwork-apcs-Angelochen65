public class Driver{
  public static int BLACK = 30;
  public static int RED = 31;

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
    for(int r = 0; r < 256; r+=12){
  for(int g = 0; g <= 256; g+=42){
    for(int b = 0; b <= 256; b+=12){
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    }
  }
    System.out.println();
}
  }
}
