package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Select_K_Distinct_Character_Without_Repetition {
    public static void generateSelection(int i,  String ustr ,int ssf ,int ts,String asf){
        if(i==ustr.length()){
            if(ssf==ts){
                System.out.println(asf);
            }
            return ;
        }
        char ch =ustr.charAt(i);
        //generateSelection(i+1,ustr,ssf+0,ts,asf +"");
        generateSelection(i+1,ustr,ssf+1,ts,asf+ch);
        generateSelection(i+1,ustr,ssf+0,ts,asf +"");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k=Integer.parseInt(br.readLine());
        HashSet<Character>unique =new HashSet<>();
        String ustr="";
        for(char ch:str.toCharArray()){
            if(unique.contains(ch)==false){
                unique.add(ch);
                ustr+=ch;
            }
        }
        generateSelection(0,ustr,0,k,"");
    }

}
