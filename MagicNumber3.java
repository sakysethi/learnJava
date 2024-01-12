package JavaPrograms100;

// Program to check if any entered number is a Magic Number
class MagicNumber3 {
    public void working(int num) {

        int num1, i, j, k, flag = 0, n, sum = 0, c = 0;
        num1 = num;
        while (flag == 0) {
            while (num != 0) {
                n = num % 10;
                sum = sum + n;
                num = num / 10;
                c = c + 1;
            }
            if (c == 1) {
                if (sum == 1)
                    System.out.println(num1 + " is a magic number");
                else
                    System.out.println(num1 + " is not a magic number");
                flag = 1;
            }
            num = sum;
            sum = 0;
            c = 0;
        }

    }
}