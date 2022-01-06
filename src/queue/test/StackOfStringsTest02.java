package queue.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import queue.domain.FixedCapcityStackOfStrings;


public class StackOfStringsTest02 {
    public static void main(String[] args) {
        FixedCapcityStackOfStrings stack = new FixedCapcityStackOfStrings(10);
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            stack.push(s);
        }
        StdOut.print(stack);

    }
}