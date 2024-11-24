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
    ArrayList<Character> alphabet = new ArrayList<Character>();
    for(int i = 'a'; i <= 'z'; i++){
      alphabet.add((char) i);
    }
    int[] amount = new int[26];
    System.out.println(alphabet);
    System.out.println(Arrays.toString(amount));

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
      String[] thisRoom = (rooms.get(i)).split("-");
      System.out.println(Arrays.toString(thisRoom));
      String endPart = (thisRoom[thisRoom.length-1]);
      System.out.println(endPart);
      int bracket = endPart.indexOf("[");
      int roomNum = Integer.parseInt(endPart.substring(0,bracket));
      String real = endPart.substring(bracket + 1, endPart.length() - 1);
      System.out.println(""+ bracket + " " + roomNum);
      System.out.println(real);
      System.out.print(Arrays.toString(thisRoom));
      System.out.println(thisRoom.length);
      System.out.println(" " + thisRoom[0].substring(0, 1));
      for(int roomSplit = 0; roomSplit < thisRoom.length - 1; roomSplit++){
        for(int indChar = 0; indChar < thisRoom[roomSplit].length(); indChar++ ){
        amount[alphabet.indexOf(thisRoom[roomSplit].charAt(indChar))]++;
        System.out.println(thisRoom[roomSplit].charAt(indChar));
        }
      }
      System.out.println(alphabet);
      System.out.println(Arrays.toString(amount));



    }

    return 1;


  }
  /*
  [a, b, c]
  [a.count, b.count, c.count]

  */





}
