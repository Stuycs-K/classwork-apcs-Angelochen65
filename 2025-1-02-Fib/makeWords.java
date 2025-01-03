public class makeWords{
  public static void makeWords(int remainingLetters, String result, String alphabet){

        if(remainingLetters>0){
            for(int i = 0; i < alphabet.length(); i ++){

          makeWords(remainingLetters - 1, result + alphabet.substring(i, i+1), alphabet);
        }

        }
        else{
          System.out.println(result + " ");
        }
        //makeWords(remainingLetters, )
    }



  public static void main(String[] args) {
    makeWords(3, "", "abcd");

  }
}
