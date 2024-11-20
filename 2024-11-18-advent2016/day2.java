import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class day2{
  public static void main(String[] args){
    System.out.println(getCode("bathroom.txt"));



    }
  public static String getCode(String filename){
    String text = "";
    String code = "";
    int[][] keycode = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int hori = 1;
    int vert = 1;
    /*
    123
    456
    789
    */
    try {
      Scanner input = new Scanner(new File(filename));
      while (input.hasNext()) {
        text = text +  input.next();
        }

      input.close();
        } catch (FileNotFoundException e) {
          System.out.println("File not found: " + filename);
        }

        for(int i = 0; i < text.length(); i++){
          if(text.charAt(i)=='D'){
            if(vert<2){
              vert+=1;
            }
            else{
              code+=""+keycode[vert][hori];
            }
          }

            if(text.charAt(i)=='U'){
              if(vert>0){
                vert-=1;
              }
              else{
                code+=""+keycode[vert][hori];
              }
          }
          if(text.charAt(i)=='L'){
            if(hori>0){
              hori-=1;
            }
            else{
              code+=""+keycode[vert][hori];
            }
          }

          if(text.charAt(i)=='R'){
            if(hori<2){
              hori+=1;
            }
            else{
              code+=""+keycode[vert][hori];
            }
          }


        }
          return code;
      }


  }
