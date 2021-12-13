package Stacks_And_Queues;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Introduction_To_Stacks {

        public static void main (String[] args) throws java.lang.Exception
        {
            Stack< Integer> st = new Stack< >();
            st.push(10);
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.push(20);
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.push(30);
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.push(40);
            System.out.println(st + "->" + st.peek() + " " + st.size());
            System.out.println("Is Stack Empty: " + st.empty());
            st.pop();
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.pop();
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.pop();
            System.out.println(st + "->" + st.peek() + " " + st.size());
            st.pop();
            System.out.println(st + "->" + " " + st.size());
            System.out.println("Is Stack Empty: " + st.empty());
        }
    }

