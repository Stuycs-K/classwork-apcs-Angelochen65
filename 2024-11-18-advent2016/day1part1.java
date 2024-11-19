import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day1part1{
  int vertical = 0;
  int horizontal = 0;

  public static void main(String[] args){
    System.out.println(countBlocks("taxicab.txt"));

    }

    public static int countBlocks(String filename){
      int vert = 0;
      int hori = 0;


       ArrayList<String> pos = new ArrayList<String>();
       pos.add("north");

      try {
        Scanner input = new Scanner(new File(filename));
        input.useDelimiter(", ");
        while (input.hasNext()) {
          // if(pos.equals("north") && input.next)
            


       }
            input.close();
          } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
          }
          return Math.abs(vert)+Math.abs(hori);
        }

        public void changeDirection(ArrayList<String> arr, String b){
          if(a[0].equals("north") && b.equals("R")){
            a.set(0, "east");
          }
          else if(a[0].equals("north") && b.equals("L")){
            a.set(0, "west");
          }

          if(a[0].equals("east") && b.equals("R")){
            a.set(0, "south");
          }
          else if(a[0].equals("east") && b.equals("L")){
            a.set(0, "north");
          }
          if(a[0].equals("south") && b.equals("R")){
            a.set(0, "west");
          }
          else if(a[0].equals("north") && b.equals("L")){
            a.set(0, "east");
          }
          if(a[0].equals("west") && b.equals("R")){
            a.set(0, "north");
          }
          else if(a[0].equals("west") && b.equals("L")){
            a.set(0, "south");
          }

        }



    }
