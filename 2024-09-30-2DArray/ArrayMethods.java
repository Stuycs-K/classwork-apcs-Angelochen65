public class ArrayMethods{ // Angelo Chen, angeloc81@nycstudents.net, Ivan Chen, ivanc178@nycstudents.net
  public static void main(String[] args) {
    int[] arr1 = {2,3,4,9};
    int[][] arr2 = {{2,3,4}, {5,6,7}, {2,4,9}};
    int[][] arr3 = {{3,4}, {5,6,7}, {}};
    int[][] arr4 = {{1,2,3}, {4,5,6}};
    int[][] arr5= {{1,2}, {4,5}, {6,7}, {8,9}};
    int[][] arr6 = {{-5, 6, 7},{2,-3,-592},{-15,25,2}};


    System.out.println("Previous arrToString: ");
    System.out.println("Expected: [2, 3, 4, 9]  vs Actual: ");
    System.out.println(arrToString(arr1));

    System.out.println("Testing new arrToString");
    System.out.println("Expected: [[2, 3 ,4], [5, 6, 7], [2, 4, 9]]  vs  Actual: ");
    System.out.println(arrToString(arr2));
    System.out.println("Testing new arrToString");
    System.out.println("Expected: [[3, 4], [5, 6, 7], []]  vs  Actual: ");
    System.out.println(arrToString(arr3));

    System.out.println("Testing arr2DSum =");
    System.out.println("Expected: 42    vs  Actual: ");
    System.out.println(arr2DSum(arr2));
    System.out.println("Testing arr2DSum");
    System.out.println("Expected: 25    vs  Actual: ");
    System.out.println(arr2DSum(arr3));

    System.out.println("Testing swapRC");
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]]");
    System.out.println(arrToString(swapRC(arr4)));
    System.out.println("Testing swapRC");
    System.out.println("Expected: [[1, 4, 6, 8], [2, 5, 7, 9]]");
    System.out.println(arrToString(swapRC(arr5)));

    System.out.println("Testing replaceNegative");
    System.out.print("Original: ");
    System.out.println(arrToString(arr6));
    System.out.println("Expected: {{1, 6, 7}, {2, 1, 0}, {0, 25, 2}}   Actual: ");
    replaceNegative(arr6);
    System.out.println(arrToString(arr6));

    System.out.println(arrToString(arr2));
    System.out.println(arrToString(copy(arr2)));
    int[][] copied = copy(arr2);
    arr2[0][0] = 99;
    System.out.println(arrToString(arr2));
    System.out.println(arrToString(copy(copied)));

  }

  public static String arrToString (int[]ary){
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
//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
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

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  int sums = 0;
  for(int i = 0; i< nums.length; i++){
    for (int a = 0; a < nums[i].length; a++){
      sums+= nums[i][a];
    }
  }
  //use a nested loop to solve this
  return sums;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
   int[][] arr = new int[nums[0].length][nums.length];
   for(int i = 0; i < nums[0].length; i++){
     for(int a = 0; a < nums.length; a++){
         arr[i][a] = nums[a][i];
     }
   }

   return arr;
 }

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
  return arr;//placeholder so it compiles
}
}
