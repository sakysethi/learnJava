package JavaPrograms100;

// Store N elements in an array WORK and compute the total number of 
// times M occurs in WORK. Where N and M are the inputs alongwith the 
// elements of the array.	Program to print the frequency of M in an 
// array of N elements.

class FreqArray {
    private int a[] = new int[10];
    private int nnn, mmm;

    public void cal() {

        nnn = 10;
        int c = 0, i;
        for (i = 0; i < nnn; i++)
            if (a[i] == mmm)
                c = c + 1;
        System.out.println("The frequency of " + mmm + " in the array is " + c);
    }

    public void work1(int nn, int mm, int num[]) {
        for (int i = 0; i < nn; i++) {
            a[i] = num[i];
        }
        nnn = nn;
        mmm = mm;
    }
}
