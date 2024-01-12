package JavaPrograms100;
//Write a program to input any ten numbers  and print the maximum and minimum.

class MaxMin {
    public void work() {
        int n[] = { 2, 3, 4, 5, 6, 7, 8, 65, 45, 87 };
        int a, max, min, b;
        max = n[0];
        min = n[0];
        for (int i = 1; i < 10; i++) {
            if (n[i] > max)
                max = n[i];
            if (n[i] < min)
                min = n[i];
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
