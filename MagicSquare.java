package JavaPrograms100;

// Example program to display the magic square of an entered value of n and x.
// where n is the number of terms required for the array (nxn) and x is the value of the first element.
class magic {
    int arr[][] = new int[10][10];

    void compute(int n, int x) {

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
                System.out.print(arr[i][k] + "   ");
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