package JavaPrograms100;

// Program to input a number and print its binary equivalent.
class PrintBinaryEquivalent

{
    public void work(int n) {
        int a[] = new int[10];
        int c = -1, p;

        while (n > 0)

        {
            c = c + 1;
            p = n % 2;
            if (p == 0) {
                a[c] = 0;
            } else

            {
                a[c] = 1;
            }
            n = n / 2;
        }
        for (int i = c; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
