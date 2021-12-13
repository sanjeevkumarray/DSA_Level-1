package StrinrgStrirngBuilder;

public class String_Builder_Performance {
    public static void main(String args[]){
        //method 1
        /*
        int n=1000;
        long start=System.currentTimeMillis();
        String s="";
        for(int i=0; i<n; i++){
            s+=i;
        }
        long end =System.currentTimeMillis();
        long duration=end-start;
        System.out.println(duration);

         */
//method 2

        int n=10000;
        long start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n;i++) {
            sb.append(i);
        }
            long end =System.currentTimeMillis();
            long duration=end-start;
            System.out.println(duration);
        }
    }



