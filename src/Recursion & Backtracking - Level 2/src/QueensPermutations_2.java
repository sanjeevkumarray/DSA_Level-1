package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class QueensPermutations_2 {
    public static void queenPermutations1_2d_AS_2D_Boxs(int qpsf, int tq, int row, int col, String asf,boolean[] queens) {
        // write your code here
        if (row == tq) {
            if (qpsf == tq) {
                System.out.println(asf);
            }
            return;
        }
        int nr = 0;
        int nc = 0;
        String  sep = "";
        if  (col == tq - 1) {
            nr = row + 1;
            nc = 0;
            sep = "\n";
        }
        else{
            nr = row;
            nc = col + 1;
            sep = "\t";
        }
        for (int i = 0; i < queens.length; i++) {
            if (queens[i] == false) {
                queens[i] = true;
                queenPermutations1_2d_AS_2D_Boxs(qpsf + 1, tq, nr, nc, asf + "q" + (i + 1) + sep, queens);
                queens[i] = false;
            }
        }
        queenPermutations1_2d_AS_2D_Boxs  (qpsf+0, tq,nr,nc,asf +"-" +sep,queens);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean []queens= new boolean[n] ;

        queenPermutations1_2d_AS_2D_Boxs(0, n, 0, 0, "",queens );
    }
}
