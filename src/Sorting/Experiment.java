package Sorting;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Experiment {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Double[] a = new Double[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform();
        }
        Insertion.sort(a);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i]);

        }

    }
}
