package tcsnqt;

public class GeometricSeries {

	public static void main(String[] args) {
		int arr[] = new int[10];

		// The first element of the array is 1
		arr[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0) {
				// If i is odd, calculate using multiplication by 2
				arr[i] = arr[i - 1] * 2;
			} else {
				// If i is even, calculate using multiplication by 3
				arr[i] = arr[i - 1] * 3;
			}
		}

		for (int j : arr) {
			System.out.print(j + " ");
		}
	}
}
