package JavaPrograms100;

//Program to input any number and check if it is a prime. Also implement the logic of display of all twin primes within a given limit.

public class Primes {
    public boolean isPrime(int n) {
        // Returns true if n is a prime false otherwise
        // assume n is >1
        // initialise instance variables
        int x = 0;
        int count = 0;
        for (x = 2; x < n; x++) {
            if (n % x == 0)
                count++;
        }
        if (count == 0)
            return true;
        else
            return false;
    }

    public void twinPrime(int limit) {
        int num = 0, i = 0;
        for (i = 2; i < limit - 2; i++) {
            num = i + 2;
            if (isPrime(i) && isPrime(num))
                System.out.println(i + " " + num + " are twin primes");
        }
    }
}
