package JavaPrograms100;

// Program to compute the factorial
class factorial {
  /** Compute and return x!, the factorial of x */
  public int fact(int x) {
    int fact = 1;
    for (int i = 2; i <= x; i++) // loop
      fact *= i; // shorthand for: fact = fact * i;
    return fact;
  }
}
