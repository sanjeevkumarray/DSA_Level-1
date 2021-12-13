package Dynamic_Programming;
import java.io.*;
import java.util.*;

public class Buy_And_Sell_Stocks_Infinite_Transactions_Allowed {



        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            int bon = 0;
            int son = 0;
            int op = 0;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i - 1]){
                    op += arr[son] - arr[bon];
                    bon = son = i;
                } else {
                    son++;
                }
            }

            op += arr[son] - arr[bon];
            System.out.println(op);
        }

    }


