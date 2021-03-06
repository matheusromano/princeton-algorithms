package queue.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import queue.domain.StackOfStrings;

public class StackOfStringsTest {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals( "+" )){
                StdOut.print(stack.pop());
            }
            else {
                stack.push(s);
            }

        }

    }
}