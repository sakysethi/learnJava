package JavaPrograms100;

//To print the first ten terms of the fibonacci series:

// Example class program to display the first ten terms
// of the fibonacci series

class Fibo {
    public void series() {
        int count = 1, a = 1, b = 0, c = 0;
        while (count <= 10) {
            System.out.println(a);
            c = b + a;
            b = a;
            a = c;
            count = count + 1;
        }
    }
}
