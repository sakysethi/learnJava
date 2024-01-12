package JavaPrograms100;

// Program to display the output as:
// 55555
// 54444
// 54333
// 54322
// 54321
class OutputPattern {
    public void display() {
        int a = 5, c = 5;
        for (int i = 5; i >= 1; i--) {
            for (int k = a; k >= i; k--) {
                System.out.print(k);
            }
            for (int j = 1; j <= c - 1; j++) {
                System.out.print(c);
            }
            System.out.println();
            c = c - 1;
        }
    }
}
