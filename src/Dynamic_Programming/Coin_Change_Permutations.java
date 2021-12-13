package Dynamic_Programming;
import java.io.*;
import java.util.*;

public class Coin_Change_Permutations {


        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();

            int coins []= new int[n];
            for(int i=0; i<coins.length; i++){
                coins[i]= sc.nextInt();
            }

            int amt = sc.nextInt();
            int dp[]= new int[amt+1];
            dp[0]=1;

            for(int j=1; j<=amt;j++){
                for(int coin:coins){
                    if(coin <=j){
                        int res=j-coin;
                        dp[j]+=dp[res];
                    }
                }
            }
            System.out.println(dp[amt]);
        }
    }

