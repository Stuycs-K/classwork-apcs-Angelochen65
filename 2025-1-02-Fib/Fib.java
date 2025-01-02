public class Fib{
  //46 is the largest number under 10 seconds, it is also the largest

  public static int fib(int n){
    if(n == 0 || n == 1){
      return n;
    }
    else{
      return fib(n-1) + fib(n-2);
    }
  }
  public static void main(String[] args) {
    System.out.println(fib(47));

  }
}
