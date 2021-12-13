package Recursion;
import java.util.Scanner;
public class powerlogarthimic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int xn=powerlogarthimic(x,n);
        System.out.println(xn);
    }
    public static int powerlogarthimic(int x,int n){
        if(n==0){
            return 1;
        }
        int xpnb2 = powerlogarthimic(x,n/2);
        int xn=xpnb2*xpnb2;
        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }
}
