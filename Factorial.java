package JavaPrograms100;
// Write a program to define a function fact() to compute the factorial of any entered number.

class compute {
  public void fact(int a) {
    int s = 1;
    for (int i = 1; i <= a; i++)
      s = s * i;
    System.out.println("The factorial of " + a + " is " + s);
  }
}
