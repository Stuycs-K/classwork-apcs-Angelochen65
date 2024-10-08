import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] arr1 = {2,3,4,9};
    int[][] arr2 = {{2,3,4}, {5,6,7}, {2,4,9}};
    int[][] arr3 = {{3,4}, {5,6,7}, {}};
    int[][] arr4 = {{1,2,3}, {4,5,6}};
    int[][] arr5= {{1,2}, {4,5}, {6,7}, {8,9}};
    int[][] arr6 = {{-5, 6, 7},{2,-3,-592},{-15,25,2}};

    System.out.println(Arrays.toString(arr1)==arrToString(arr1));
    System.out.println(Arrays.toString(arr2)==arrToString(arr2));

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String end = "[";
     for(int i = 0; i < ary.length; i++){
       end+= ary[i];
       if(i != ary.length -1){
         end+=", ";
       }
     }
     end += "]";
     return end;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++){
      result+=arrToString(ary[i]);
        if(i != ary.length-1){
      result+=", ";
    }
  }
  result+="]";
  return result;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sums = 0;
  for(int i = 0; i< nums.length; i++){
    for (int a = 0; a < nums[i].length; a++){
      sums+= nums[i][a];
    }
  }
  return sums;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int row =  0; row < vals.length; row++){
     for (int column = 0; column < vals[row].length; column++){
       if (vals[row][column] < 0){
         if (row == column){
           vals[row][column] = 1;
         }
         else vals[row][column] = 0;
       }
     }
   }
  }

  public static int[] returnCopy (int[]ary){
   int[] newAry = new int[ary.length];
   for (int i = 0; i < ary.length; i++){
     newAry[i] = ary[i];
   }
   return newAry;

 }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] arr = new int[nums.length][];
  for(int i = 0; i< arr.length; i++){
    arr[i] = returnCopy(nums[i]);
  }
  return arr;
}


  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums[0].length; i++){
      for(int a = 0; a < nums.length; a++){
        arr[i][a] = nums[a][i];f
    }
  }
    return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
