package Stacks_And_Queues;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Introduction_to_Queues {

        public static void main (String[] args) throws java.lang.Exception
        {
            Queue< Integer> q = new ArrayDeque< >();
            q.add(10);
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.add(20);
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.add(30);
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.add(40);
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.remove();
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.remove();
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.remove();
            System.out.println(q + "->" + q.peek() + " " + q.size());
            q.remove();
            System.out.println(q + "->" + " " + q.size());
        }
    }

