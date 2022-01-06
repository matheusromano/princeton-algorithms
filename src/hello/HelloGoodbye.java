package hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class HelloGoodbye {

	public static void main(String[] args) {
		StdOut.println("Whats the name: ");
		String read1 = StdIn.readString();

		StdOut.println("Whats the other name: ");
		String read2 = StdIn.readString();

		StdOut.println(names(read1, read2));
		StdOut.println(namesOut(read1, read2));

	}

	public static String names(String n1, String n2) {
		return "Hello " + n1 + " and " + n2 ;


	}

	public static String namesOut(String n1, String n2) {
		return "GoodBye " + n2 + " and " + n1 ;

	}
}


