package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class QueensCombination_1 {
    public static void queenPermutations1_2d_AS_2D_Boxs(int qpsf, int tq, int row, int col, String asf){
        // write your code here
        if(row==tq){
            if(qpsf==tq){
                System.out.println(asf);
            }
            return;
        }

        int nr=0;
        int nc=0;
        String yasf="";
        String nasf="";
        if(col==tq-1){
            nr=row+1;
            nc=0;
            yasf=asf+"q\n";
            nasf=asf+"-\n";
        }else{
            nr=row;
            nc=col+1;
            yasf=asf+"q";
            nasf=asf+"-";
        }
        queenPermutations1_2d_AS_2D_Boxs(qpsf+1,tq,nr,nc,yasf);
        queenPermutations1_2d_AS_2D_Boxs(qpsf+0,tq,nr,nc,nasf);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        queenPermutations1_2d_AS_2D_Boxs(0, n, 0, 0, "");
    }
}

