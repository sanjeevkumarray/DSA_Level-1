package Recursion;
import java.util.Scanner;
public class printKPC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printKPC(str,"");
    }

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String ros=ques.substring(1);

        String codeforch=codes[ch-'0'];
        for (int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            printKPC(ros,ans+chcode);
        }
    }
}
/*
input
678
output
ptv
ptw
ptx
puv
puw
pux
qtv
qtw
qtx
quv
quw
qux
rtv
rtw
rtx
ruv
ruw
rux
stv
stw
stx
suv
suw
sux

 */