package FunctionArrays;
import java.util.*;
public class Any_Base_Multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    public static int getProduct(int b ,int n1,int n2){
        int rv =0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int sprd =getProductWithSingleDigit(b,n1,d2);
            rv=getSum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d2)
    {
        int rv = 0;

        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0) //we proceed with multiplication till
        // the multiplier exhausts or carry is not zero
        {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / b; //setting carry
            d = d % b; //setting digit
            rv = rv + d * p; // updating return_value
            p = p * 10; //updating power
        }
        return rv;
    }



    public static int getSum(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while ( n1 > 0 || n2 > 0 || c > 0) //while numbers are not-nero or carry is non-zero
        {
            int d1 = n1 % 10; //extracting digits
            int d2 = n2 % 10;
            int d = d1 + d2 + c; //adding up extracted digits
            c = d / b; //storing carry for next addition
            d = d % b;
            rv += d * p;
            p *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return rv;
    }
}


