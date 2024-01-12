package JavaPrograms100;

// Example Class Definition to demostrate the
// usage of if else if statement

class IfElseIf {
    public void work() {
        int a = 10, b = 20, c = 30;
        System.out.println("The greatest value is ");
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (c > b) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }
    }
}
