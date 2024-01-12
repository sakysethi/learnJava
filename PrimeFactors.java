package JavaPrograms100;

// Code a program to compute the prime factors of any number
// using a function 
class primefactors {

    void fact(int n) // Definition
    {
        int cc = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                // checking prime
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0)
                        cc++;
                }
                if (cc == 2)
                    System.out.println(i + " is a prime factor of " + n);
                cc = 0;
            }
        }
    }
}
