package JavaPrograms100;

// Class to input any two numbers and compute their LCM and HCF
public class LCM_HCF {
    private int x, y;

    // constructor for objects of class work
    public LCM_HCF() {
        // initialise instance variables
        x = 0;
        y = 0;
    }

    public void inputvalue(int y1, int y2) {
        // Enter elements
        x = y1;
        y = y2;
    }

    public void computelcmhcf() {
        int p = 0, i, lcm = 0, hcf = 0;
        p = x * y;
        for (i = 1; i < p; i++) {
            if (x % i == 0 && y % i == 0)
                hcf = i;
        }
        lcm = p / hcf;
        System.out.println("The lcm is " + lcm);
        System.out.println("The hcf is " + hcf);
    }
}
