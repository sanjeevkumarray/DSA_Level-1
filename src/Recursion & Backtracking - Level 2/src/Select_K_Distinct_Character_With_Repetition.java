package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Select_K_Distinct_Character_With_Repetition {
    public static void generateSelection(String ustr, int cs, int ts, int lc, String asf) {
        if (cs > ts) {
            System.out.println(asf);
            return;
        }
        for (int i = lc + 1; i < ustr.length(); i++) {
            char ch = ustr.charAt(i);
            generateSelection(ustr, cs + 1, ts, i, asf + ch);
        }
    }

    public static void main (String[]args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.contains(ch) == false) {
                unique.add(ch);
                ustr += ch;
            }
        }
        generateSelection(ustr, 1, k, -1,"");
    }

}


