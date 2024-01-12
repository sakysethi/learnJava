package JavaPrograms100;

// Develop a program to input any number  and print the sum of its digits.

class PrintSumOfDigits {
    public void work(int number) {
        int digit, c, sum = 0;
        c = number;
        do {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        } while (number != 0);
        System.out.println("The sum of the number " + c + " is " + sum);
    }
}
