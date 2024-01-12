package JavaPrograms100;

//This program creates a magic square box of order n x n. 
// The speciality of a magic square box is that the sum of elements of 
//any row or any column // is always equal. 
// Enter the row of matrix and the starting index of matrix number generation

class MagicSquareBox {
    int arr[][] = new int[10][10];

    public void working(int n, int x) {
        int a, b, i;
        int j, k;
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                arr[i][k] = -1;
            }
        }
        arr[0][n / 2] = x;

        magic(0, n / 2, x, n);
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }

    void magic(int a, int b, int x, int n) {
        int c;
        c = 1;
        int i;
        for (x = x + 1, i = 2; i <= n * n; i++, c++, x++) {
            if (c < n) {
                a = a - 1;
                b = b - 1;
                if (a == -1)
                    a = n - 1;
                if (b == -1)
                    b = n - 1;
            } else {
                a = a + 1;
                c = 0;
            }
            arr[a][b] = x;
        }

    }

}