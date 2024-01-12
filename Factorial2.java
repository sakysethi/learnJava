package JavaPrograms100;

//To calculate the factorial of any number using multiple initialization expressions.

class Factorial2 {
    public void fact() {
        int x, fact = 1;
        int number = 10;
        for (x = 1; x <= number; x = x + 1) {
            fact = fact * x;
        }
        System.out.println("The factorial of " + number + "is ");
        System.out.println(fact);
    }
}
