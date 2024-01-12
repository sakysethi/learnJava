package JavaPrograms100;
// Program to display the following output:

// 11
// 12 22
// 13 23 33

class out

{
    public void working() {
        int a, b, i, j;
        for (i = 1; i <= 3; i = i + 1) {
            for (j = 1; j <= i; j = j + 1) {
                System.out.print(" " + j + i);
            }
            System.out.println();
        }
    }
}
