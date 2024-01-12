package JavaPrograms100;

// Program to enter a number and check if it is a prime
class CheckNumberIfprime {
    public void compute(int a) {
        int i, c = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0)
                c = c + 1;
        }
        if (c == 2)
            System.out.println("Ist is a prime number");
    }
}
