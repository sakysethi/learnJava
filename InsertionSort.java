package JavaPrograms100;

//Program to sort any array of numbers using  Insertion Sort Method

class InsertionSort {
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
        for (int k = 1; k < n; k++) {
            flag = M[k];
            j = k - 1;
            while (flag < M[j]) {
                M[j + 1] = M[j];
                j = j - 1;
                if (j < 0)
                    break;
            }
            M[j + 1] = flag;
        }

        System.out.println("The sorted array is ");
        for (i = 0; i < n; i++) {
            System.out.println(M[i] + " ");
        }
    }
}
