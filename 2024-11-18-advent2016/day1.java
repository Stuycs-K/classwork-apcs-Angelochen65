import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class day1{
  int vertical = 0;
  int horizontal = 0;

  public static void main(String[] args){
    // System.out.println(countBlocks("taxicab.txt"));
    System.out.println(revisit("taxicab.txt"));


    }

    public static int countBlocks(String filename){
      int vert = 0;
      int hori = 0;


       ArrayList<String> pos = new ArrayList<String>();
       pos.add("north");

      try {
        Scanner input = new Scanner(new File(filename));
          input.useDelimiter(",\\s*");


        while (input.hasNext()) {

          String nextToken= input.next();

          changeDirection(pos, nextToken.substring(0,1));
          int dist = Integer.parseInt(nextToken.substring(1).trim());
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
        String currentDirection = arr.get(0);

        if (currentDirection.equals("north") && b.equals("R")) {
            arr.set(0, "east");
        } else if (currentDirection.equals("east") && b.equals("R")) {
            arr.set(0, "south");
        } else if (currentDirection.equals("south") && b.equals("R")) {
            arr.set(0, "west");
        } else if (currentDirection.equals("west") && b.equals("R")) {
            arr.set(0, "north");
        }

        if (currentDirection.equals("north") && b.equals("L")) {
            arr.set(0, "west");
        } else if (currentDirection.equals("east") && b.equals("L")) {
            arr.set(0, "north");
        } else if (currentDirection.equals("south") && b.equals("L")) {
            arr.set(0, "east");
        } else if (currentDirection.equals("west") && b.equals("L")) {
            arr.set(0, "south");
        }
    }
    public static int revisit(String filename){
      int direction = 0;
      int x = 0;
      int y = 0;
      int[] sides = new int[]{0,0,0,0};
      ArrayList<String> places = new ArrayList<String>();
      places.add("0,0");
      String text = "";
      try {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
          text = text +  input.nextLine();
       }
            input.close();
          } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
          }

      String[] texts = text.split(", ");
      System.out.println(Arrays.toString(texts));
      for(int i = 0; i < texts.length; i++){
        if(texts[i].charAt(0)=='R'){
          direction=(direction+1)%4; }

        else{
          direction=(direction+3)%4;
        }
        int dist = Integer.parseInt(texts[i].substring(1));
        for(int a = 0; a < dist; a++){
          sides[direction]++;
          y = sides[0] - sides[2];
          x = sides[1] - sides[3];
          if(places.indexOf(x + "," + y) < 0){
          places.add(x + "," + y); }
          else{
            return Math.abs(x) + Math.abs(y);
          }
        }

        }
        return 0;

      }


    }
