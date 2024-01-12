package JavaPrograms100;

// Program to enter a number
// and print the number of odd numbers from 1 to the number, even numbers
// and also the summation of odd and even numbers.
class OddEvenNumber {
    public void compute(int a) {
        int k = 0, i = 0, t = 0, n = 0, b;
        do {
            b = a % 10;
            if (b % 2 == 0) {
                k = k + 1;
                i = i + b;
            } else if (a % 2 != 0) {
                t = t + 1;
                n = n + b;
            }
            a = a / 10;
        } while (a != 0);
        System.out.println("\n number of even digits is " + k);
        System.out.println("\n summation of even digit is " + i);
        System.out.println("\n number of odd digit is " + t);
        System.out.println("\n summation of odd digit is " + n);
    }
}
