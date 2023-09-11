package tcsnqt;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tj = new Scanner(System.in);
		System.out.println("Enter the firsts string : ");
		String input1 = tj.nextLine();

		System.out.println("Enter the second string : ");
		String input2 = tj.nextLine();
		boolean istrue = checkAnagram(input1, input2);
		System.out.println("Is the given strings are Anagram : " + istrue);

	}

	private static boolean checkAnagram(String input1, String input2) {
		// TODO Auto-generated method stub

		int len1 = input1.length();
		int len2 = input2.length();
		if (len1 != len2) {
			System.out.println("Both strings are of different lengths");
		}

		char in1[] = input1.toCharArray();
		char in2[] = input2.toCharArray();
		Arrays.sort(in1);
		Arrays.sort(in2);

		// approach- 1
		 return Arrays.equals(in1, in2);

		// approach -2
		// return

	}

}
