package JavaPrograms100;

// Program to enter any number (max 3 digits) and check the nature of its digits.
class NatureOfDigits1 {
    public void compute(int a) {

        if (a < 10) {
            System.out.println(a + " is single digit no.");
        }
        if (a > 10 && a < 100) {
            System.out.println(a + "is double digit no.");
        }
        if (a > 100) {
            System.out.println(a + " is triple digit no.");
        }
    }
}
