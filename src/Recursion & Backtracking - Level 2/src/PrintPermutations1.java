package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class PrintPermutations1 {
    public static void  PrintPermutations1( int cb,int tb,int [] items,int ssf,int ts,String asf){

        if(cb>tb){
            if(ssf==ts){
                System.out.println(asf);
            }
            return;
        }
        for(int i=0; i<ts;i++){
            if(items[i]==0){
                items[i]=1;
                PrintPermutations1(cb+1,tb,items,ssf+1,ts,asf+(i+1));
                items[i]=0;
            }
        }
        PrintPermutations1(cb+1,tb,items,ssf,ts,asf+0);
    }
    public static void main(String[] args) throws  Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int nboxes=Integer.parseInt(br.readLine());
        int ritems=Integer.parseInt(br.readLine());
        PrintPermutations1(1,nboxes,new int[ritems],0,ritems,"");
    }
}
