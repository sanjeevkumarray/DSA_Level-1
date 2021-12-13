package Dynamic_Programming;
import java.io.*;
import java.util.*;

public class Buy_And_Sell_Stocks_One_Transaction_Allowed {


        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int [] prices =new int[n];
            for(int i=0;i<prices.length;i++){
                prices[i] =sc.nextInt();
            }

            int lsf =Integer.MAX_VALUE;
            int op=0;
            int pist=0;

            for(int i=0; i<prices.length;i++){
                if(prices[i]<lsf){
                    lsf=prices[i];
                }
                pist=prices[i]-lsf;
                if(pist>op){
                    op=pist;
                }
            }

            System.out.println(op);
        }

    }
