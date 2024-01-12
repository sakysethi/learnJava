package JavaPrograms100;

//Program to input a number and print the average of its factors
class AverageOfFactors {
    public void inputcal(int number) {

        int i, j, sum = 0, c = 0;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
                c = c + 1;
            }
        }
        System.out.println("The sum of factors is " + sum);
        System.out.println("The average of factors is " + (sum / c));
    }
}
