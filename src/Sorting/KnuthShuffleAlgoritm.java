package Sorting;

import edu.princeton.cs.algs4.StdRandom;

public class KnuthShuffleAlgoritm {
        public static void shuffle(Object[] a)
        {
            int N = a.length;
            for (int i = 0; i < N; i++)
            {
                int r = StdRandom.uniform(i + 1);
             //   exch(a, i, r);
            }
        }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}


