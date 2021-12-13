package Basic_Java;
import java.util.*;
public class Count_Digits_In_A_Number {
        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int digit = 0;
            while(n!=0){
                n = n/10;
                digit++;
            }

            System.out.println(digit);

        }
    }



