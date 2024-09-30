public class ArrayMethods{ // Angelo Chen, angeloc81@nycstudents.net, Ivan Chen, ivanc178@nycstudents.net
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4};
    System.out.println(aryToString(arr1));
    int[][] arr2 = {arr1,{3,4,5,6},{1,2,5,6},{}};
  }

  public static String aryToString (int[]ary){
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
  String result = "";
  for (int i = 0; i < ary.length; i++){
    result+=aryToString(ary[i]);
  }
  return result;
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  return 0;
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
}
