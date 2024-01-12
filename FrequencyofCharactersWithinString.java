package JavaPrograms100;

// Program to print the frequency of all the characters within a string.

public class FrequencyofCharactersWithinString {
    // instance variables - replace the example below with your own
    private int i, a1, l, p, j, freq;

    /**
     * Constructor for objects of class reverse
     */
    public FrequencyofCharactersWithinString() {
        p = 0;
        freq = 0;// initialise instance variables

    }

    public void sampleMethod(String str) {
        int ii;
        l = str.length();
        System.out.print(str);
        for (i = 0; i < l; i++) {
            char a = str.charAt(i);
            for (ii = 0; ii < l; ii++) {
                char b = str.charAt(ii);
                if (a == b)
                    freq = freq + 1;
            }
            System.out.println(a + " occurs " + freq + " times");
            freq = 0;
        }
    }
}
