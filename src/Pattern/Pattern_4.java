package Pattern;
import java.util.*;
public class Pattern_4 {
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int n  = scn.nextInt();
            int sp = 0, st = n; // sp = spaces ; st = stars
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= sp; j++) // runs till the number of spaces on particular line
                {
                    System.out.print("	");  //prints the number of spaces required on the line
                }
                for (int j = 1; j <= st; j++) // runs till the number of stars on particular line
                {
                    System.out.print("*	"); //prints the number of stars required on the line
                }
                sp++;                      //incrementing the spaces by 1 for next line
                st--;                      //decrementing the stars by 1 for next line
                System.out.println();      //Adding new line for output on console
            }
        }
    }

