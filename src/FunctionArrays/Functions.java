package FunctionArrays;
import java.util.*;
public class Functions {
    //Without Scanner;
    /*
    public static int factorial(int n) {
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact = nfact * i;
        }
        return nfact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int nfact = factorial(n);
        int nmrfact = factorial(n - r);
        System.out.println(n + "P" + r + " = " + (nfact / nmrfact));
    }
}

     */
// Scanner;
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();

       int nfact=1;
      for(int i=1; i<=n;i++){
        nfact*=i;
        }
        int nmrfact=1;
        for(int i=1; i<=n-r;i++){
        nmrfact*=i;
        }
        int npr= nfact/nmrfact;
        System.out.println(n + "p" + r + " =" + npr);
        }
        }

/*
public static int f(int x){
   int xsquare=x*x;
     return xsquare;
}

public static int fact(int x){
   int rv =1;
   for(int i=1; i<=x;i++){
   rv=rv*i;;

}
 return rv;
}

int nfact =fact(n);
  int nmrfact=fact(n-r);
 */


// method 2
/*

public class Main{
public static int fact(int x){
   int rv =1;
   for(int i=1; i<=x;i++){
   rv=rv*i;;

}
 return rv;
}

public static void main (String[] args){
Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int r=sc.nextInt();

   int nfact =fact(n);
   int nmrfact=fact(n-r);

 int npr= nfact/nmrfact;
 System.out.println(n + "p" + r + " =" + npr);
}
}
 */
