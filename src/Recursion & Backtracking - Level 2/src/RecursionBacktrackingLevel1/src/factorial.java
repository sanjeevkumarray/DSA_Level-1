package Recursion;
import java.util.Scanner;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
        //Method1
     public static int factorial(int n) {
       if(n==0 ||n==1) return 1;
        int fnm1 =factorial(n-1);
        int fn=n*fnm1;
        return fn;

    }
}

                //Method 2
/***    public static int factorial(int n) {
         if (n == 0 || n == 1)
             return 1;
         return n * factorial(n - 1);***/
    //}
//}
