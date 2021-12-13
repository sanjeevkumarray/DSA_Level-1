package FunctionArrays;
import java.util.*;
public class Any_Base_To_Decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
        int power=1;
        int rev=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            rev+=(power*d);
            power=power*b;

        }
        return rev;
    }
}
// input 1172
 //         8
//output      634
