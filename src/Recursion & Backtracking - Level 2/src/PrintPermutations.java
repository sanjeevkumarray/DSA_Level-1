package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class PrintPermutations {
    public static void  PrintPermutations(int [] boxes,int ci,int ti){
        if(ci>ti){
            for(int i=0; i<boxes.length;i++){
                System.out.println(boxes[i]);
            }
            System.out.println();
            return;
        }

        for(int i=0; i<boxes.length;i++){
            if(boxes[i]==0){
                boxes[i]=ci;
                PrintPermutations(boxes,ci+1,ti);
                boxes[i]=0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int nboxes=Integer.parseInt(br.readLine());
        int ritems=Integer.parseInt( br.readLine());
        PrintPermutations(new int[nboxes],1,ritems);
    }
}
