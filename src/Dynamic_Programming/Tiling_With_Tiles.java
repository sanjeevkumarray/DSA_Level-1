package Dynamic_Programming;
import java.io.*;
import java.util.*;
public class Tiling_With_Tiles {   //Tiling With 2 * 1 Tiles

        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int dp[]=new int[n+1];
            dp[1]=1;
            dp[2]=2;

            for(int i=3;i<=n;i++){
                dp[i]= dp[i-1]+dp[i-2];

            }
            System.out.println(dp[n]);
        }

    }

