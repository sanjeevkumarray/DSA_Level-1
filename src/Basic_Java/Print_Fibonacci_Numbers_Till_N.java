package Basic_Java;
import java.util.*;
public class Print_Fibonacci_Numbers_Till_N {
        public static void main(String[] args) {
            // write your code here

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int a = 0;
            int b = 1;
            //int counter = 1;
            for(int i=0;i<n; i++){
                System.out.println(a);
                int sum = a + b;
                a = b;
                b = sum;

            }
        }
    }

    /*

    import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
      System.out.println(a);
      int c = a + b;
      a = b;
      b = c;
    }
  }
}
     */
