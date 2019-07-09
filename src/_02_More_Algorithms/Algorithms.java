package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < eggs.size(); i++) {

			if (eggs.get(i).equals("cracked")) {

				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub

		int pearls = 0;

		for (int i = 0; i < oysters.size(); i++) {

			if (oysters.get(i).equals(true)) {

				pearls++;

			}

		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub

		double largest = 0;

		for (int i = 1; i < peeps.size(); i++) {

			if (peeps.get(i) > peeps.get(i - 1)) {

				largest = peeps.get(i);
			}

		}
		return largest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub

		String longestWord = "";

		for (int i = 1; i < words.size(); i++) {

			if (longestWord.length() < words.get(i).length()) {

				longestWord = words.get(i);
			}

		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub

		for (int i = 0; i < message1.size(); i++) {

			if (message1.get(i).contains("... --- ...")) {

				return true;

			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub

		boolean inOrder = true;
		while (inOrder) {

			inOrder = false; 
			
			for (int i = 0; i < results.size() - 1; i++) {

				if (results.get(i) > results.get(i + 1)) {

					double x = results.get(i);
					double z = results.get(i + 1);
					double y = x;
					x = z;
					z = y;

					inOrder = true;

				}

			}

		}

		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub

		boolean inOrder = true;

		while (inOrder) {
			
			inOrder = false;

			for (int i = 0; i < unsortedSequences.size() -1; i++) {

				if (unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length()) {
					
					String x = unsortedSequences.get(i);
					String temp = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i));
					unsortedSequences.set(i + 1, unsortedSequences.get(i + 1));
					
//					String x = unsortedSequences.get(i);
//					String temp = unsortedSequences.get(i);
//					String other = unsortedSequences.get(i+1);
//					unsortedSequences.set(i, temp);
//					unsortedSequences.set(i + 1, other);
					
					inOrder = true;
				}

			}
		}

		return unsortedSequences;
	}
}
