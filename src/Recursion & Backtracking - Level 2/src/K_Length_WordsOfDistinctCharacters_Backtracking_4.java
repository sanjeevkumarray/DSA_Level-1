
package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class K_Length_WordsOfDistinctCharacters_Backtracking_4 {

    public static void main(String[] args) throws Exception{
        BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        int k=Integer.parseInt(br.readLine());
        HashMap<Character,Integer> fmap= new HashMap<>();
        String ustr ="";
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(fmap.containsKey(ch)==true){
                fmap.put(ch,fmap.get(ch)+1);
            }
            else{
                fmap.put(ch,1);
                ustr+=ch;
            }
        }

        fun(ustr, fmap,1,k,"");
    }

    public static void fun(String str, HashMap<Character,Integer> fmap,int  cs, int ts,String asf){

        if(cs==ts+1){
            System.out.println(asf);

            return ;
        }

        for(int i=0; i<str.length();i++){
            char ch= str.charAt(i);
            if(fmap.get(ch)>0){
                fmap.put(ch,fmap.get(ch)+1);
                fun(str,fmap,cs+1,ts, asf+ch);
                fmap.put(ch,fmap.get(ch)+1);
            }
        }
    }
}

