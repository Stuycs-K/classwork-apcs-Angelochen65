import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day4{
  public static void main(String[] args){
    System.out.println(realRoom("room.txt"));




  }

  public static int realRoom(String filename){
    ArrayList<String> rooms = new ArrayList<String>();

    try {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
          rooms.add(input.nextLine());


        }
        input.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
    }
    System.out.println(rooms);
    return 0;

  }
  /*
  [a, b, c]
  [a.count, b.count, c.count]

  */





}
