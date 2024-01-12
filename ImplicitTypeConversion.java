package JavaPrograms100;

// Example program to demonstrate the
// usage of implicit or automatic type conversion

public class ImplicitTypeConversion {
    public void test() {
        byte amount = 10;
        float account = 12.32F;
        double sum = (double) (amount * account);
        System.out.println("The value of sum is " + sum);
    }
}
