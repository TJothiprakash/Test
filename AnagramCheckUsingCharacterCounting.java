package tcsnqt;

import java.util.Scanner;

public class AnagramCheckUsingCharacterCounting {

	public static void main(String[] args) {
		Scanner tj = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String input1 = tj.nextLine();

		System.out.println("Enter the second string : ");
		String input2 = tj.nextLine();
		boolean isTrue = areAnagrams(input1.toLowerCase(), input2.toLowerCase()); // Convert to lowercase
		System.out.println("Are the given strings anagrams: " + isTrue);
	}

	public static boolean areAnagrams(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		int[] charCount = new int[26]; // Assuming lowercase English letters
		for (char c : word1.toCharArray()) {
			if (c >= 'a' && c <= 'z') { // Check for lowercase letters
				charCount[c - 'a']++;
			}
		}
		for (char c : word2.toCharArray()) {
			if (c >= 'a' && c <= 'z') { // Check for lowercase letters
				charCount[c - 'a']--;
				if (charCount[c - 'a'] < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
