package Arrays;
import java.io.*;
import java.util.*;
public class Diagonal_Traversal {
    public static void main (String[]args) throws Exception
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt ();
        int [][]arr = new int[n][n];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr[0].length; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

                 //int j=0 ,i=0 ,g =0;
        for(int g=0; g<arr.length;g++){
            for(int i=0, j=g; j<arr.length; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
