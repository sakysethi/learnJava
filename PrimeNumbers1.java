package JavaPrograms100;

// Program to compute and print all prime numbers between 100 and 500
class PrimeNumbers1 {
    void prime() {
        int i, j, s = 0, d = 0;
        for (i = 100; i < 500; i++) {
            s = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    s = s + 1;
            }
            if (s == 2) {
                System.out.println(i + " ");
                d = d + 1;
            }
        }
        System.out.println();
        System.out.println("the no. of prime no. are  =  " + d);
    }
}
