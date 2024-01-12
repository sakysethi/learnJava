package JavaPrograms100;

// Program to input a number and print its odd factors
class OddFactors {
    public void working(int number) {
        int i, j;

        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                if (i % 2 != 0)
                    System.out.println(i + " is an odd factor of " + number);
            }
        }
    }
}
