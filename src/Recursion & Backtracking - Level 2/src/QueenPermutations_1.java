package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class QueenPermutations_1 {
    public static void queenPermutations1_2d_AS_2D_Queens(int qpsf, int tq, int[][] chess) {
        // write your code here
        if (qpsf == tq) {
            for(int row=0;row<chess.length;row++){
                for(int col=0;col<chess.length;col++){
                    if(chess[row][col]==0){
                        System.out.print("-\t");
                    }else{
                        System.out.print("q"+chess[row][col]+"\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0; i<chess.length;i++){
            for(int j=0; j<chess[0].length;j++){
                if(chess[i][j]==0){
                    chess[i][j]=(qpsf+1);
                    queenPermutations1_2d_AS_2D_Queens(qpsf+1,tq,chess);
                    chess[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        queenPermutations1_2d_AS_2D_Queens(0, n, chess);
    }
}
