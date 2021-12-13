package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Fibonacci_dp {

        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int fibn= Fib(n);
            System.out.println(fibn);
        }

        public static int Fib(int n){
            if(n==0 ||n==1){
                return n;
            }

            int fibnm1= Fib(n-1);
            int fibnm2=Fib(n-2);
            int fibn =fibnm1+fibnm2;
            return fibn;
        }
    }

/*
psvm(String[] args){
   Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int fibn =FibMemoized(n,new int[n+1]);
    System.out.println(fibn);
}

         public static int Fib(int n){
            if(n==0 ||n==1){
                return n;
            }
           System.out.println("Hello"+  n);
          int fibnm1= Fib(n-1);
            int fibnm2=Fib(n-2);
            int fibn =fibnm1+fibnm2;
            return fibn;
        }


public static int FibMemoized(int n ,int [] qb){
     if(n==0 || n==1){
     return n;
}
  if(qb[n]!=0){
      return qb[n];
}

int fibnm1=FibMemoized(n-1,qb);
int fibnm2=FibMemoized(n-2,qb);
int fibn =fibnm1+fibnm2;

qb[n] =fibn;
return fibn;
}
}

 */