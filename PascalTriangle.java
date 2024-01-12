package JavaPrograms100;

// Program to  display a Triangle of numbers called the Pascal's Triangle, 
//when provided with the number of rows. 
class PascalTriangle {
    public void working(int n) {
        int pal[][] = new int[50][50];
        int i, j, k;
        for (i = 0; i < n; i++) {
            pal[i][0] = 1;
            pal[i][i] = 1;
            for (j = 1; j < i; j++) {
                pal[i][j] = pal[i - 1][j - 1] + pal[i - 1][j];
            }
            for (j = 1; j <= (n - (i + 1)); j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(pal[i][k]);
            }
            System.out.println();
        }
    }
}
