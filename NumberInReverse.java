package JavaPrograms100;
// Write a program  to input any number and print the 

//same in reverse.

class NumberInReverse {
    public void working(int number) {
        int digit = 0, c = 0, number1 = 0;

        int n1 = number;
        do {
            digit = number % 10;
            number1 = number1 * 10 + digit;
            number = number / 10;
        } while (number != 0);
        System.out.println("The reverse of the number " + n1 + " is " + number1);
    }
}
