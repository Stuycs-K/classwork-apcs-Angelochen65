public class MyArrays {
  public static int[] returnCopy (int[]ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;

  }
  public static void main(String[] args){
    int[] test = new int[] {1,2,3,4,5};
    System.out.println("Are the arrays equal?" + test == returnCopy(test));
    test[0] = 3;
    System.out.println("Are the arrays the same?" + test == returnCopy(test));
  }
}
