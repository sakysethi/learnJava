package JavaPrograms100;

// Program to create a 3x3 matrix and store the first nine
// natural numbers row wise
// The program should further display the sum of rows,
// columns and diagnols
class test1 {

	public void work() {
		int num[][] = new int[3][3];
		int d = 1, sumrow = 0, sumcol = 0, sumleftd = 0, sumrightd = 0, i, j;
		// storing elements in the array
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)

			{
				num[i][j] = d;
				d = d + 1;
			}
		}
		// reading the matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sumrow = sumrow + num[i][j];
			}
			System.out.println("The sum of " + i + " th row is " + sumrow);
			sumrow = 0;
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				sumcol = sumcol + num[j][i];
			}
			System.out.println("The sum of " + i + " th column is " + sumcol);
			sumcol = 0;
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j)
					sumleftd = sumleftd + num[i][j];
				if (i + j == 3)
					sumrightd = sumrightd + num[i][j];
			}
		}
		System.out.println("The sum of numbers in the left diagnol is " + sumleftd);
		System.out.println("The sum of numbers in the right diagnol is" + sumrightd);

	}
}
