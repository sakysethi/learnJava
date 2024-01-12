package array;

public class PrintingElements {

	public static void main(String[] args) {

		/*
		 * int[] a = {10, 20, 30, 40, 50};
		 * 
		 * 
		 * for(int i=0; i<=a.length; i++) {
		 * 
		 * System.out.print(a[i]+ "  "); }
		 */

		int[][] b = { { 10, 20 }, { 40, 50, 60 } };
		for (int x = 0; x < b.length; x++) {
			for (int y = 0; y < b[x].length; y++) {
				System.out.print(b[x][y] + "   ");
			}
			System.out.println();
		}
	}
}