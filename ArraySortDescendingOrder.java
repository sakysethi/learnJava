package JavaPrograms100;

//Program to Sort a given Array in Descending Order

class ArraySortDescendingOrder {
    public void work() {
        int number[] = { 15, 8, 12, 32, 52 };
        int n = number.length;
        System.out.print("The elements of array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(number[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        System.out.print("Sorted Elements of the Array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(number[i]);
        }
    }
}
