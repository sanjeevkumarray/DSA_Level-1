package Basic_Java;
import java.util.*;
public class Digits_Of_A_Number {

        public static void main(String[] args) {
            // write your code here
            Scanner sc=new Scanner(System.in);
            int  n=sc.nextInt();
            int res=0;
            int temp=n;
            while(temp!=0){
                temp=temp/10;
                res++;

            }

            int div=(int)Math.pow(10,res-1);
            while(div!=0){
                int p=n/div;
                System.out.println(p);
                n=n%div;
                div=div /10;
            }
        }
    }

