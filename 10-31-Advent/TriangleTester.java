import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester {

  public static void main(String[] args) {
      System.out.println(countTrianglesA("inputTri.txt"));
      System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static boolean valTriangle(int a, int b, int c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Main function to count the number of valid triangles in the file
  public static int countTrianglesA(String filename) {
    int total = 0;
    try {
      Scanner input = new Scanner(new File(filename));
      while (input.hasNextLine()) {
          int a = input.nextInt();
          int b = input.nextInt();
          int c = input.nextInt();
          if (valTriangle(a, b, c)) {
            total++; }
            if (input.hasNextLine()) {
              input.nextLine();
            }
          }
          input.close();
        } catch (FileNotFoundException e) {
          System.out.println("File not found: " + filename);
        }
        return total;
    }

    public static int countTrianglesB(String filename){
      int total = 0;
      
      try {
        String all = "";
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextInt()) {
          all+= input.nextInt() + " ";
            }
            String[] digits = all.split(" ");
            int a = 0;
            for(int i = 0; i < digits.length-6; i++){
              a++;
              if(valTriangle(Integer.parseInt(digits[i]), Integer.parseInt(digits[i+3]), Integer.parseInt(digits[i+6]))){
                total++;
              }
              if(a == 3){
                a = 0;
                i+= 6;
              }
            }
            input.close();
          } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
          }
          return total;

    }


}
