package Recursion;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int xn = power(x, n);
        System.out.println(xn);

    }
    //Method 1

    /*** public static int power(int x, int n) {
     if(n==0) return 1;
     int xnm1 =power(x,n-1);
     int xn =x*xnm1;
     return xn;}
     ***/

    //Method 2
    public static int power(int x, int n) {
        if (x == 0) return 1;
        return n * power(x - 1, n);
    }
}


