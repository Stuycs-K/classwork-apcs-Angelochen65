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
    int total = 0;
    int large = 1;
    char ch1 = 'x';
    ArrayList<String> rooms = new ArrayList<String>();
    ArrayList<Character> repeats = new ArrayList<Character>();
    ArrayList<Character> check = new ArrayList<Character>();
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
      String match = "";

      repeats = new ArrayList<Character>();
      nums = new ArrayList<Integer>();
      letters = rooms.get(i).split("-");
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
          for(int x = 0; x < 5; x++){
          large = 1;

          for(int largest = 0; largest < nums.size(); largest++){

            // System.out.print(nums.get(largest) + " ");
            if(nums.get(largest)>large){
              if(nums.get(largest)==large){
                if(ch1 > repeats.get(largest)){
                  ch1 = repeats.get(largest);
                }
              }

              large = nums.get(largest);
              ch1 = repeats.get(largest);
              System.out.println(ch1);
              System.out.println(large);

            }
      }
      System.out.println(ch1);
      // System.out.println(nums);
      // System.out.println(repeats);
      repeats.remove(nums.indexOf(large));
      nums.remove(nums.indexOf(large));
      System.out.println(nums);
      System.out.println(repeats);
      check.add(ch1);
      System.out.println(check);
    }
    for(int p = 0; p < check.size(); p++){
      match= match + check.get(p);
    }
    System.out.println(match);


    }

    // System.out.println(repeats);
    // System.out.println(nums);
    // System.out.println(rooms);
    return 0;

  }
  /*
  [a, b, c]
  [a.count, b.count, c.count]

  */





}
