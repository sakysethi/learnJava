package JavaPrograms100;

// Example Class definition to demostrate the increment operators.
public class IncrementOperator {
    public void operation() {
        int a = 10;
        int b = 20;
        System.out.println("a is " + (a++));
        System.out.println("b is " + (b++));
        System.out.println("Now a is " + a);
        System.out.println("Now b is " + b);
        System.out.println("Now a is " + (++a));
        System.out.println("Now b is " + (++b));
    }
}
