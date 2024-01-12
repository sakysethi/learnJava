package JavaPrograms100;

//Program to perform Linear Search in a given array of numbers:
class LinearSearch {
  protected int M[] = new int[10];

  public void fill(int s)// argument s to be the element to be searched
  {
    int x = 0, i = 0, n = 10, middle = 0, pos = 0, first = 0;
    for (i = 0; i < n; i++) {
      M[i] = i + 1;
    }
    // Display of array

    for (i = 0; i < n; i++) {
      System.out.println(M[i]);
    }

    for (i = 0; i < n; i++) {
      if (M[i] == s)
        System.out.println(M[i] + " occurs at position " + (i + 1));
    }
  }
}
