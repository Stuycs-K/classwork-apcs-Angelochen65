import java.util.ArrayList;

public class ArrayListPractice {

  public static void main(String[] args){
    ArrayList<String> Triangle = createRandomArray(20);
    ArrayList<String> Square = createRandomArray(10);
    System.out.println(Triangle);
    System.out.println(Square);
    replaceEmpty(Triangle);
    replaceEmpty(Square);
    System.out.println(Triangle);
    System.out.println(Square);
    System.out.println(makeReversedList(Triangle));
    System.out.println(mixedLists(Triangle, Square));
  }

  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> randomArray = new ArrayList<String>(size);
    int randomNumber = 0;
    for (int i = 0; i < size; i++){
      randomNumber = (int) (Math.random() * 11);
      if (randomNumber == 0){
        randomArray.add("");

      }
      else {
        randomArray.add("" + randomNumber);
      }
    }
    return randomArray;
  }
  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      if(original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original){
    ArrayList<String> reverse = new ArrayList<String>(original.size());
    for(int i = original.size()-1; i>= 0; i--){
      reverse.add(original.get(i));
    }
    return reverse;
  }

  public static ArrayList<String> mixedLists(ArrayList<String> a, ArrayList<String> b){
    ArrayList<String> mixedArray = new ArrayList<String>();
    ArrayList<String> bigArray = new ArrayList<String>();
    int minSize = 0;
    if (a.size() > b.size()){
      minSize = b.size();
       bigArray = a;
    }
    else {
      minSize = a.size();
     bigArray = b;
    }
    for (int i = 0; i < minSize; i++){
      mixedArray.add(a.get(i));
      mixedArray.add(b.get(i));
    }
    for (int i = minSize; i < bigArray.size(); i++){
      mixedArray.add(bigArray.get(i));
    }
    return mixedArray;
  }
}
