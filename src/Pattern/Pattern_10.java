package Pattern;
import java.util.*;
public class Pattern_10 {
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int os = n / 2;     //outer spacing = half of n
            int is = -1;        //same as 0; not to print anything

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= os; j++)   //print outer spaces
                {
                    System.out.print("	");
                }
                System.out.print("*	");          //print star

                for (int j = 1; j <= is; j++)
                {
                    System.out.print("	");
                }

                //now we address the special condition
                //as we print only a single star on the first
                //and last row without any inner space

                if ( i > 1 && i < n) //if the current row is neither first or last
                {
                    System.out.print("*");
                }

                if (i <= n / 2)
                {
                    os--;
                    is += 2;
                }
                else
                {
                    os++;
                    is -= 2;
                }
                System.out.println();
            }
        }
    }

