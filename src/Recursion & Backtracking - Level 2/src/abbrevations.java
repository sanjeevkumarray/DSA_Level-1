package Recursion_Backtracking;
import java.util.*;
public class abbrevations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        solution(str,"",0,0);
    }

    public static void solution(String str, String asf, int count, int pos) {
        if(pos==str.length()){
            if(count==0){
                System.out.println(asf);
            }
            else{
                System.out.println(asf+count);
            }
            return;
        }
        if(count>0){
            solution(str,asf+count+str.charAt(pos),0,pos+1);
        }else{
            solution(str,asf+str.charAt(pos),0,pos+1);
        }
        solution(str,asf,count+1,pos+1);
    }
}
