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
  public static void main(String[] args){
    int[] test = new int[] {1,2,3,4,5};

    System.out.print("Are the arrays equal ?");
    System.out.println(test == returnCopy(test));
    System.out.print(aryToString(test));
  }
}
