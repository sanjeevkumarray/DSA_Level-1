package Basic_Java;
import java.util.*;
public class Grading_System {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int b = scn.nextInt();
            scn.close();
            int d = toDecimal(n, b);
            System.out.println(d);
        }

        public static int toDecimal(int n, int b) {
            int multiplier = 0, ans_num = 0;
            while (n > 0) {
                int remainder = n % 10;
                n = n / 10;
                ans_num += remainder * Math.pow(b, multiplier);
                multiplier++;
            }
            return ans_num;
        }
    }

    /*
                               import java.util.*;
                                public class Main {
                                    public static void main(String[] args) {
                                        Scanner scn = new Scanner(System.in);
                                        int marks = scn.nextInt();
                                        if (marks > 90) {
                                            System.out.print("excellent");
                                        } else if (marks > 80 && marks <= 90) {
                                            System.out.print("good");
                                        } else if (marks > 70 && marks <= 80) {
                                            System.out.print("fair");
                                        } else if (marks > 60 && marks <= 70) {
                                            System.out.print("meets expectations");
                                        } else {
                                            System.out.print("below par");
                                        }
                                    }
                                }
     */
