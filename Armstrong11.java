package JavaPrograms100;

// Program to input a number and check if it is an
// armstrong number. A number is said to be armstrong
// if it is equal to the sum of the cubes of its digits.
class Armstrong11 {
    public void arm(int a) {
        int b, sum = 0, c, n;
        n = a;
        do {
            b = a % 10;
            c = b * b * b;
            sum = sum + c;
            a = a / 10;
        } while (a != 0);
        if (sum == n)
            System.out.println(n + " no is armstrong");
        else
            System.out.println(n + " no is not armstrong");
    }
}
