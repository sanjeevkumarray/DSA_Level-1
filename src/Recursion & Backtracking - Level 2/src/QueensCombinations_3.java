package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class QueensCombinations_3 {
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {  //QueensCombinations-3 |2d As 1d-Queens
        // write your code here
        if (qpsf == tq) {
            for(int row=0;row<chess.length;row++){
                for(int col=0;col<chess.length;col++){
                    if(chess[row][col]==true){
                        System.out.print("q\t");
                    }else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int cell=lcno+1;cell<chess.length*chess.length;cell++){
            int row=cell/ chess.length;
            int col=cell% chess.length;

            chess[row][col]=true;
            queensCombinations(qpsf+1,tq,chess,cell);
            chess[row][col]=false;

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}
