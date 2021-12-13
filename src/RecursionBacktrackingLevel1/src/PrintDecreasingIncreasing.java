package Recursion;
import java.util.Scanner;
import java.util.*;
public class PrintDecreasingIncreasing {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int k=s.nextInt();
            pdi(k);
        }
        public static void pdi(int k) {
            if(k==0) return;
            System.out.println(k);
            pdi(k-1);
            System.out.println(k);
        }
    }



