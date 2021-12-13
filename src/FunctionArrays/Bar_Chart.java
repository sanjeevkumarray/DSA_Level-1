package FunctionArrays;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Bar_Chart {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0;i < n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int i =1;i < n;i++)
        {
            if(arr[i]  >max)
            {
                max = arr[i];
            }
        }
        for(int i =0;i < max;i++)
        {
            for(int j=0;j < n;j++)
            {
                if( max - arr[j]  <= i)
                {
                    System.out.print("*	");

                }
                else
                {
                    System.out.print("	");
                }
            } System.out.println();
        }
    }
}
