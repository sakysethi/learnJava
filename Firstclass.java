package coreJava;

public class Firstclass {

    public void gerData() {
        System.out.println("I am in method");
    }

    int b = 30;
    static int a = 4;

    public static void main(String[] args) {

        System.out.println("Hello World!!!");
        System.out.println("How are you?");
        System.out.println(a);

        Firstclass fn = new Firstclass();
        fn.gerData();
        System.out.println(fn.b);

        SecondClass sn = new SecondClass();
        sn.setData();

        if (5 > 2) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }

        for (int i = 0; i <= 10; i = i + 2) {
            if (i == 8)
                System.out.println("Number is 8");
            else
                System.out.println("number is not 8");
        }

        for (int j = 0; j <= 10; j++) {
            System.out.print(j + " ");
        }
    }
}
