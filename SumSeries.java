package tcsnqt;

import java.util.Scanner;
import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int input = scanner.nextInt();
		int output = sumSeries(input);
		System.out.println("Result: " + output);
	}

	private static int sumSeries(int input) {
		int sum = 0;
		int num = 0;

		for (int i = 1; i <= input; i++) {
			switch (i % 4) {
			case 1:
				sum += num;
				num++;
				break;
			case 2:
				sum += 2;
				break;
			case 3:
				sum += num;
				break;
			case 0:
				num++;
				break;
			}
		}

		return sum;
	}
}
