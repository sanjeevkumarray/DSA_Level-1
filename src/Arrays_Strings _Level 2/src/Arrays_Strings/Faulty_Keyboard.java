package Arrays_Strings;
import java.util.*;
public class Faulty_Keyboard {
    public static boolean isLongPressedName(String name, String typed) {

        if(name.length()>typed.length()) return false;

        if(name.charAt(0)!=typed.charAt(0)) return false;

        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){

                i++;
                j++;
            }else{
                if(typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }else return false;
            }
        }
        if(i<name.length()) return false;
        if(j<typed.length()){

            while(j<typed.length()){
                if(typed.charAt(j)!=typed.charAt(j-1)) return false;
                j++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        String typed = scn.next();

        boolean res = isLongPressedName(name, typed);

        System.out.println(res);
    }
}

