package tcsnqt;

import java.util.Scanner;

public class VehicleCrossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, sum = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (a != 0) {
				sum += c;

			} else {
				c++;
			}
		}
		System.out.println(sum);
	}

}
