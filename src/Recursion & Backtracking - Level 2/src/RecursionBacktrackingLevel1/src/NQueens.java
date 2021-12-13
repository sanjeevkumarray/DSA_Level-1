package Recursion;
import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][] chess=new int[n][n];
        printNqueen(chess,"",0);
    }

    public static void printNqueen(int chess[][],String qsf, int row) {
        if(row== chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(isitsafeplaceforthequeen(chess,row,col)==true){
                chess[row][col]=1;
                printNqueen(chess,qsf+row+"-"+col+",",row+1);
                chess[row][col]=0;
            }
        }
    }

    public static boolean isitsafeplaceforthequeen(int chess[][],int row,int col) {
        for(int i=row-1,j=col; i>=0; i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1; i>=0 && j >= 0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j < chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
/*
input  :4
output:
 0-1,1-3,2-0,3-2,
0-2,1-0,2-3,3-1,
 */