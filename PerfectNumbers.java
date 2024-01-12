package JavaPrograms100;

//Write a program to define and utilize a function perfect(),  to print all perfect numbers from 1 to 100.
//(  A perfect number is a number which is equal to the  sum of its factors eg. 6=1+2+3, hence 6 is a perfect number).

class PerfectNumbers {
    public void perfect() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i - 1; j++) {
                if (i % j == 0)
                    sum = sum + j;
            }
            if (sum == i)
                System.out.println(i + " is a perfect number");
            sum = 0;
        }
        System.out.println();
    }

}
