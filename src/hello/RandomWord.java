package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {
	public static void main(String[] args) {
		String[] words = StdIn.readAllStrings();
		List<Integer> champions = new ArrayList<>();
		double iterations = 1250;

		for ( int i = 0; i < iterations; i++) {
			champions.add(getChampion(words));
		}
		Collections.sort(champions);
		StdOut.println(champions);
	}

	private static int getChampion(String[] words) {
		int champion = 0;
		for (double i = 1; i <= words.length; i++) {
			double p = 1 / i;
			if (StdRandom.bernoulli(p)) {
				champion = (int)i;
			}
		}
		return champion;
	}
}
