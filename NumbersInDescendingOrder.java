package JavaPrograms100;

// Develop a program to input any number
// and print them in descending order without using the sorting technique.

class NumbersInDescendingOrder {
    public void work(int number) {
        int c[] = new int[6];
        int digit, sum = 0, i = 0;

        do {
            digit = number % 10;
            i++;
            c[i] = digit;
            number = number / 10;
        } while (number != 0);
        // display in sorted manner
        System.out.println("The sorted digit format is ");
        for (int m = 9; m >= 0; m--) {
            for (int j = 1; j <= i; j++) {
                if (c[j] == m)
                    System.out.print(c[j]);
            }
        }
    }
}
