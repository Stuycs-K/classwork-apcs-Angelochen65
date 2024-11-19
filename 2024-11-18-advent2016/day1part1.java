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
       System.out.println(pos.get(0));
       System.out.println(pos.get(0).equals("north"));

      try {
        Scanner input = new Scanner(new File(filename));
          input.useDelimiter(",\\s*");


        while (input.hasNext()) {

          String nextToken= input.next();

          changeDirection(pos, nextToken.substring(0,1));
          int dist = Integer.parseInt(nextToken.substring(1));
            if(pos.get(0).equals("north")){
              vert+= dist;
            }
            if(pos.get(0).equals("south")){
              vert-= dist;
            }
            if(pos.get(0).equals("east")){
              hori+= dist;
            }
            if(pos.get(0).equals("west")){
              hori -= dist;
            }
       //
       //
       }
            input.close();
          } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
          }
          return Math.abs(vert)+Math.abs(hori);
        }

        public static void changeDirection(ArrayList<String> arr, String b){
          if(arr.get(0).equals("north") && b.equals("R")){
            arr.set(0, "east");
          }
          else if(arr.get(0).equals("north") && b.equals("L")){
            arr.set(0, "west");
          }

          if(arr.get(0).equals("east") && b.equals("R")){
            arr.set(0, "south");
          }
          else if(arr.get(0).equals("east") && b.equals("L")){
            arr.set(0, "north");
          }
          if(arr.get(0).equals("south") && b.equals("R")){
            arr.set(0, "west");
          }
          else if(arr.get(0).equals("north") && b.equals("L")){
            arr.set(0, "east");
          }
          if(arr.get(0).equals("west") && b.equals("R")){
            arr.set(0, "north");
          }
          else if(arr.get(0).equals("west") && b.equals("L")){
            arr.set(0, "south");
          }

        }



    }
