package StrinrgStrirngBuilder;

public class String_Builder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);

        // chracter check
        char ch= sb.charAt(0);   //get
        System.out.println(ch);

        sb.setCharAt(0,'d');  //update
        System.out.println(sb);

        //insert
        sb.insert(2,'y');
        System.out.println(sb);

        //delete
        sb.deleteCharAt(2) ;
        System.out.println(sb);

        //append
        sb.append('g');
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }

}
