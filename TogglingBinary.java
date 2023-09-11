package tcsnqt;

import java.util.Scanner;

public class TogglingBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(" Input number : " + input);
		String binaryinput = Integer.toBinaryString(input);
		System.out.println(" Binary representation of the input  : " + binaryinput);
		String binaryoutput = togglebinary(binaryinput);
		System.out.println(" Binary representation of the output : " + binaryoutput);
		System.out.println(" Decimal value of the output :" + Integer.parseInt(binaryoutput, 2));
	}

	private static String togglebinary(String binaryinput) {
		// TODO Auto-generated method stub
		StringBuilder toggledBinary = new StringBuilder();

		for (int i = 0; i < binaryinput.length(); i++) {
			char currentChar = binaryinput.charAt(i);

			// Toggle '0' to '1' and '1' to '0'
			if (currentChar == '0') {
				toggledBinary.append('1');
			} else if (currentChar == '1') {
				toggledBinary.append('0');
			} else {
				// Handle any non-binary characters (optional)
				toggledBinary.append(currentChar);
			}
		}

		return toggledBinary.toString();

	}
}