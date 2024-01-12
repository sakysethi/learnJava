package JavaPrograms100;

// Program to print the sum of factorial of the digits of an entered number.
class FactorialOfDigits {
    void working(int a) {
        long fact = 1, i, j, sum = 0;
        int num = a;
        int digit;
        while (num > 0) {
            digit = num % 10;
            for (i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
            fact = 1;
        }
        System.out.println("The sum of factorials of the digits of" + a + " is " + sum);
    }
}
