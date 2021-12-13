package Recursion;
import java.util.*;
public class LastIndexOfArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int ans=lastIndex(arr,0,d);
        System.out.println(ans);
    }

    public static int lastIndex(int arr[], int idx,int x) {
        if(idx== arr.length){
            return -1;
        }
        int liic=lastIndex(arr,idx+1,x);
        if(liic==-1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }
        else{
            return liic;
        }
    }
}
