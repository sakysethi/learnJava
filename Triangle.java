package JavaPrograms100;

// Program to print a triangle as follows:
//1
//12
//123
//1234
//12345

class Triangle {
    public void working() {
        int a, b, i, j;
        for (i = 1; i <= 5; i = i + 1) {
            for (j = 1; j <= i; j = j + 1) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
