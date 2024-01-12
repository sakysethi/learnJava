package JavaPrograms100;

// Create a program to define a function found() 
// to print the Highest Common Factor of any two numbers.

class HCF {
    public void found(int a, int b) // declaration of the function
    {
        int p, h = 0;
        p = a * b;
        for (int i = 1; i <= p; i++) {
            if (a % i == 0 && b % i == 0)
                h = i;
        }
        System.out.println("The HCF of the given two numbers is " + h);
    }
}
