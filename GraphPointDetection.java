package tcsnqt;

import java.util.Scanner;

public class GraphPointDetection {

	public static void main(String[] args) {
		Scanner sv = new Scanner(System.in);
		int n = sv.nextInt();
		getNodeDistance(n);
	}

	private static void getNodeDistance(int n) {
		// TODO Auto-generated method stub
		int distance = 10;
		int x = 0;
		int y = 0;
		char c = 'R';
		while (n > 0) {
			switch (c) {
			case 'R':
				x = x + distance;
				c = 'U';
				distance = distance + 10;
				break;

			case 'U':
				y = y + distance;
				c = 'L';
				distance = distance + 10;
				break;
			case 'L':
				x=x-distance;
				c='D';
				distance=distance+10;
				break;
			case 'D':
				y=y-distance;
				c='A';
				distance=distance+10;
				break;
			case 'A':
				x=x+distance;
				c='R';
				distance=distance+10;
				break;
			}
			//System.out.println("x,y is  "+x+"  "+y);
			n--;
		}
		
		System.out.println("x,y is  "+x+"  "+y);
	}

}
