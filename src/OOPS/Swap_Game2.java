package OOPS;

public class Swap_Game2 {
    public static class Person {
        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] says hi") ;
        }
    }
    public static void main(String[] args) {
        Swap_Game1.Person p1 = new Swap_Game1.Person();
        p1.age = 10;
        p1.name = "A";
        //p1.saysHi();

        Swap_Game1.Person p2 = new Swap_Game1.Person();
        p2.age = 20;
        p2.name = "B";
        // p2.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap1(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap1(Swap_Game1.Person psn1, Swap_Game1.Person psn2){
        int age =psn1.age;
        psn1.age=psn2.age;
        psn2.age=age;


        String  name =psn1.name;
        psn1.name=psn2.name;
        psn2.name=name;
    }

}





