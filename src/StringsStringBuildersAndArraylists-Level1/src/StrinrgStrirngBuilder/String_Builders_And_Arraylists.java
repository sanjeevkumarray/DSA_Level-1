package StrinrgStrirngBuilder;
import java.util.Scanner ;
public class String_Builders_And_Arraylists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Normal String print functions

        // String s1 = "hello";
        //String s1 = sc.next();
        /*
         String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);

         */
        //String length print
      /*
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        /*

        //String char check
        /*
        char ch=s.charAt(2);
        System.out.println(ch);

         */
        //using loop conditions
/*
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);


 */
        // s.charAt(0)='z'; //does't work

        //check substring

        /*
        String  s = " abcd ";
        System.out.println(s.substring(1,3));

         */
//  using loop print  subString
        /*
        String s="abcd";
        for(int i=0; i<s.length();i++){
            for(int j=i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }

         */

        //add two Strings
        /*
        String s1="hello";
           // add string 2nd process  rule
       // s1+='';
       // s1+='w';
        String s2="world";
        String s3=s1+" "+s2;
        System.out.println(s3);

         */
        //use split
        String s = "abc, def ,ghi, jkl mno";
        String[] parts = s.split(" ,");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);


        }
    }
}



