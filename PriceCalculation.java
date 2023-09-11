package tcsnqt;

import java.util.Scanner;

public class PriceCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int price = calculatePrice(input);
		System.out.println("Price of the product is  " + price);
	}

	private static int calculatePrice(int input) {
		// TODO Auto-generated method stub
		int price = 1;
		int temp = 1;
		while (input > 0) {
			temp = (input % 10);
			price = (price * temp);
			// System.out.println(price);
			input = input / 10;
		}

		return price;
	}

}
