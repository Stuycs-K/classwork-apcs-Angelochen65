public class MyArrays {
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
  public static int[] returnCopy (int[]ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;

  }

  public static int[] concatArray (int[]ary1, int[]ary2){
    int index = 0;
    int[] tgt = new int[ary1.length + ary2.length];
    for(int i = 0; i < ary1.length; i++){
      tgt[i] = ary1[i];
      index++;

    }
    for(int i = 0; i < ary2.length; i++){
      tgt[index] = ary2[i];
      index++;
    }

    return tgt;
  }
  public static void main(String[] args){
    int[] test = new int[] {1,2,3,4,5};
    System.out.println("Expected: " + aryToString(test) + " actual: " + aryToString(returnCopy(test)));
    System.out.print("Are the arrays the same? ");
    System.out.println(test == returnCopy(test));
    test = new int[]{10, 20, 40, 30, 50};
    System.out.println("Expected: " + aryToString(test) + " actual: " + aryToString(returnCopy(test)));
    System.out.print("Are the arrays the same? ");
    System.out.println(test == returnCopy(test));

    int[] test1 = new int[] {1, 3, 5};
    int[] test2 = new int[] {6, 8, 10};
    System.out.println("Expected: " +
      (aryToString(test1)).substring(0, aryToString(test1).length() - 1) + ", " +
      (aryToString(test2).substring(1)));
    System.out.print(" actual: " + concatArray(test1, test2));


  }
}
