package JavaPrograms100;

// Develop a program to input a list of elements in a double dimensional array of 3x3 and print the maximum and the minimum elements alongwith their location within the array.

class MaxMinArray {
    protected int number[][] = new int[3][3];
    private int sm, lg, p1, p2, q1, q2;

    public void inputvalues(int num[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                number[i][j] = num[i][j];
            }
        }
    }

    public void comp() {
        int max = number[0][0];
        int min = number[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (max < number[i][j]) {
                    p1 = i;
                    p2 = j;
                    lg = number[i][j];
                } else {
                    q1 = i;
                    q2 = j;
                    sm = number[i][j];
                }
            }
        }
        System.out.println("largest" + lg + "position in row" + p1 + "column " + p2);
        System.out.println("smallest " + sm + "position in row" + q1 + "column " + q2);
    }
}
