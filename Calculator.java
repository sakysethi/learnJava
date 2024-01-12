package JavaPrograms100;

// Program to frame a simple calculator with functions like add, sub, mult, divide.
public class Calculator {
    // instance variables - replace the example below with your own
    private double result;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator() {
        // initialise instance variables
        result = 0;
    }

    public double add(double value) {
        // put your code here
        return result += value;
    }

    public double subtract(double value) {
        // put your code here
        return result -= value;
    }

    public double multiplyBy(double value) {
        // put your code here
        return result *= value;
    }

    public double divideBy(double value) {
        // put your code here
        if (value == 0.0)
            return result;// can not divide by 0, returning last result
        else
            return result /= value;
    }

    public double clear() {
        // put your code here
        return result = 0;
    }
}
