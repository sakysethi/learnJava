package JavaPrograms100;

//Write a program to compute prime factors of any entered number with the help of a function pfact().
class ComputePrimeFactors {

    void pfact(int n) // Definition
    {
        int t = -1;
        int anum[] = new int[10];
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                t = t + 1;
                anum[t] = i;
            }
        }
        for (int count = 0, k = 0; k <= t; k++) {
            System.out.println(anum[k] + " is a factor of " + n);
            for (int m = 1; m <= anum[k]; m++) {
                if (anum[k] % m == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(anum[k] + " is also prime");
            count = 0;
        }
    }
}
