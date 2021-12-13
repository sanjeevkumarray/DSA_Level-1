package FunctionArrays;
import java.io.*;
import java.util.*;
public class Ceil_And_Floor {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while (lo <= hi) {
            int m = (lo + hi) / 2;
            if (data >arr[m]) {
                hi = m - 1;
                ceil = arr[m];
            } else if (data < arr[m]) {
                lo = m + 1;
                floor = arr[m];
            } else {
                ceil = arr[m];
                floor = arr[m];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}