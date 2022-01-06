package Sorting;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;

public class StringSorter {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\mbraga\\projetos\\princeton-algorithms\\src\\words.txt");
        String[]a = new In(directory).readAllStrings();
        Insertion.sort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]);
        }
    }
}
