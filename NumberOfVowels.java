package JavaPrograms100;

// Program to input any string and display the number of  vowels.

public class NumberOfVowels {

    private int x, i;

    /**
     * Constructor for objects of class vowels
     * 
     */
    public NumberOfVowels() {
        // initialise instance variables
        x = 0;
    }

    public void vowel(String a) {
        for (i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')
                x++;
        }
        System.out.println(x);

    }
}
