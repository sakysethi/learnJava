package JavaPrograms100;

//Program to Sort an array using Bubble Sort Method

class BubbleSort1 {
  protected int M[] = new int[10];

  public void input(int num[])// Entry of array elements
  {
    for (int i = 0; i < 10; i++)
      M[i] = num[i];
  }

  public void sort() {
    int x = 0, i = 0, j = 0, n = 10, flag = 0;
    // Display of array
    System.out.println("The Array is ");
    for (i = 0; i < n; i++) {
      System.out.print(M[i]);
    }
    System.out.println();
    // Bubble Sort
    for (int k = 0; k < n; k++) {
      for (int kk = 0; kk < n - 1; kk++) {
        if (M[kk] > M[kk + 1]) {
          flag = M[kk];
          M[kk] = M[kk + 1];
          M[kk + 1] = flag;
        }

      }
    }
    System.out.println("The sorted array is ");
    for (i = 0; i < n; i++) {
      System.out.println(M[i] + " ");
    }
  }
}
