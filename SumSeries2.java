package tcsnqt;

public class SumSeries2 {

	public static void main(String[] args) {
		int n = 16;
		for (int i = 1, a = 0, b = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(a + " ");
				a += 2;
			} else {
				System.out.print(b + " ");
				b++;
			}
		}
	}
}
