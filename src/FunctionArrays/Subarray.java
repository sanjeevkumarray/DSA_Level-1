package FunctionArrays;
import java.io.*;
import java.util.*;
public class Subarray {
    public static void main (String[]args) throws Exception
        {
            Scanner scn = new Scanner (System.in);
            int n = scn.nextInt ();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = scn.nextInt ();
            }
            int arrSize = arr.length;
            //start point
            for (int startPoint = 0; startPoint < arrSize; startPoint++)
            {
                //group sizes
                for (int grps = startPoint + 1; grps <= arrSize; grps++)
                {
                    //if start point = 1 then
                    //grp size = 1 , print 1
                    //grp size = 2, print 1 2
                    //grp size = 3, print 1 2 3 ans so on
                    for (int j = startPoint; j < grps; j++)
                    {
                        System.out.print (arr[j] + "	");
                    }
                    System.out.println ();
                }
            }
        }
    }

