package JavaPrograms100;

// Program to display all prime fibonacci series between 1 to 10000
class primefibonacci {
    public void work() {
        System.out.println("All prime fibonacci series in the range of 1 to 10000 are");
        int r;
        int a = 1, b = 2, c = 0;
        r = isprime(a);
        if (r == 1)
            System.out.print((a) + " ");
        r = isprime(b);
        if (r == 1)
            System.out.print((b) + " ");
        while (c <= 10000) {
            c = a + b;
            r = isprime(c);
            if ((r == 1) && (c <= 10000))
                System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    int isprime(int x) {
        int i;
        if (x == 1)
            return 0;
        else {
            int p = 1;
            for (i = 2; i < x; i++) {
                if (x % i == 0)
                    p = 2;
            }
            return (p);
        }
    }
}
