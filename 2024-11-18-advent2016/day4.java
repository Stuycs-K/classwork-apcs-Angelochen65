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
    int total = 0;



    try {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
          rooms.add(input.nextLine());


        }
        input.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
    }
    for(int i = 0; i < rooms.size(); i++){
      ArrayList<Character> alphabet = new ArrayList<Character>();
      for(int alph = 'a'; alph <= 'z'; alph++){
        alphabet.add((char) alph);
      }
      ArrayList<Integer> amount = new ArrayList<Integer>();
      for(int lets = 0; lets < 27; lets++){
        amount.add(0);
      }
      String code = "";
      String[] thisRoom = (rooms.get(i)).split("-");
      String endPart = (thisRoom[thisRoom.length-1]);
      // System.out.println(endPart);
      int bracket = endPart.indexOf("[");
      int roomNum = Integer.parseInt(endPart.substring(0,bracket));
      String real = endPart.substring(bracket + 1, endPart.length() - 1);
      for(int roomSplit = 0; roomSplit < thisRoom.length - 1; roomSplit++){
        for(int indChar = 0; indChar < thisRoom[roomSplit].length(); indChar++ ){
          amount.set(alphabet.indexOf(thisRoom[roomSplit].charAt(indChar)), amount.get(alphabet.indexOf(thisRoom[roomSplit].charAt(indChar)))+1);

        }

      }
      for(int five = 0; five < 5; five++){

        int ind = 0;
        int largest = 0;
        for(int big = 0; big < amount.size(); big++){
          if(amount.get(big) > largest){
            largest = amount.get(big);
            ind = big;
          }

        }
        code = code + String.valueOf(alphabet.get(ind));
        amount.remove(ind);
        alphabet.remove(ind);
      }
      if(code.equals(real)){
        total += roomNum;
      }



      // System.out.println(alphabet);
      // System.out.println((amount));
      // System.out.println(code);



    }

    return total;


  }
  /*
  [a, b, c]
  [a.count, b.count, c.count]

  */





}
