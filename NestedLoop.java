package JavaPrograms100;

// Program to display nested for looping
class song {
  /*
   * The Song Printing program displays the "One man went to Mow" song
   * Illustrates nested and backward counting for-loops
   */

  public void work() {

    System.out.println("****** One man went to mow ******");
    for (int man = 1; man <= 5; man++) {
      System.out.println(man +
          " men went to mow, went to mow a meadow,");
      for (int companions = man; companions >= 2; companions--)
        System.out.print(companions + " men, ");
      System.out.println("1 man and his dog, " +
          "went to mow a meadow. ");
      System.out.println();
    }
  }
}
