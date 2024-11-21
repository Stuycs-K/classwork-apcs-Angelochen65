import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day4{
  public static void main(String[] args){
    System.out.println(realRoom("room.txt"));




  }

  public static int realRoom(String filename){
    ArrayList<String> rooms = new ArrayList<String>();
    ArrayList<Character> repeats = new ArrayList<Character>();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    String[] letters;

    try {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
          rooms.add(input.nextLine());


        }
        input.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
    }
    for(int i = 0; i < 1; i++){
      letters = rooms.get(i).split("-");
      System.out.println(Arrays.toString(letters));
      for(int a = 0; a < letters.length-1; a++){
        for(int b = 0; b < letters[a].length(); b++){
          if(repeats.indexOf(letters[a].charAt(b))<0){
            repeats.add(letters[a].charAt(b));
            nums.add(1);
          }
          else{
            nums.set(repeats.indexOf(letters[a].charAt(b)), nums.get(repeats.indexOf(letters[a].charAt(b)))+1);
          }
        }

      }


    }
    System.out.println(repeats);
    System.out.println(nums);
    // System.out.println(rooms);
    return 0;

  }
  /*
  [a, b, c]
  [a.count, b.count, c.count]

  */





}
