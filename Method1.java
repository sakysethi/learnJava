package coreJava;

public class Method1 {

    public void methodOne() {
        System.out.println("Hello !!");
    }

    public static void main(String[] args) {

        Method1 m1 = new Method1();
        m1.methodOne();

        Method2 m2 = new Method2();
        String x = m2.methodTwo();
        System.out.println(x);
    }

}
