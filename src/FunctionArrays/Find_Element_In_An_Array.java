package FunctionArrays;
import java.io.*;
import java.util.*;
public class Find_Element_In_An_Array {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int d= sc.nextInt();
        int  res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                res= i;
                break;
            }
        }
        System.out.println (res);
    }
}
