package JavaPrograms100;

//Example Program : Using break and continue
class BreakAndContinue {
    public void example() {
        loopone: for (int i = 1; i < 5; i++) {
            System.out.println(i);
            if (i >= 8)
                break;
            for (int k = 1; k <= 5; k++) {
                System.out.print("Hello" + k);
                if (i < k)
                    continue loopone;
            }
        }
    }
}
