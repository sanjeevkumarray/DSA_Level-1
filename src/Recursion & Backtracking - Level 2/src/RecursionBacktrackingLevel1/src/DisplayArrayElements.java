package Recursion;
import java.util.*;
public class DisplayArrayElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        displayArr(arr,0);
    }
    //Ex -> index se last tk print krde
//faith -> index+1 se end tk print krna janta h
    public static void displayArr(int arr[], int idx) {
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }
}

