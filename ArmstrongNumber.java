package JavaPrograms100;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int j[] = new int[10];
        int k = 0, n;
        double s = 0;
        double d;
        for (int i = 100; i <= 1000; i++) {
            n = i;
            while (i != 0) {
                d = i % 10;
                s = s + Math.pow(d, 3);
                i = i / 10;
            }

            i = n;
            if (s == i) {
                System.out.println(s);
                j[k] = i;
                k = k + 1;
            }
            s = 0;
        }
    }
}