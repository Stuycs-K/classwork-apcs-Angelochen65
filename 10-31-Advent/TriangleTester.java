import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){

  }

  public static int countTrianglesA(String filename){
    int total = 0;
    Scanner input = new Scanner(filename);
    while(input.hasNextLine){
      for(int i = 1; i <= 3; i++){

      }

      }
    }

    return total;

  }

  public static boolean valTriangle(int a, int b, in c){
    if(a > b && a > c){
      return (a < b + c);
    }
    if(b > a && b > c){
      return (b < a + c);
    }
    if(c > b && c > a){
      return (c < b + a);
    }
  }









}
