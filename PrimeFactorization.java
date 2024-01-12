package JavaPrograms100;

// Program to print prime factorization

class PrimeFactorization {
    public void compute(int ii) {

        int j; /* divisors */
        int p; /* powers of j in ii */
        System.out.println("The prime divisors of " + ii + " are/ is ");
        for (j = 2; ii != 1; j = j + 1) {
            if (ii % j == 0) {
                for (p = 0; ii % j == 0; p = p + 1)
                    ii = ii / j;
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
