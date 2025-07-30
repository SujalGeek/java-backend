public class Loop {
  public static void main(String[] args) {
    int i = 1;
    while (i < 10) {
      System.out.println("Value of i: " + i);
      i++;
    }
    System.out.println("Loop ended. Final value of i: " + i);

    int j = 1;
    // do while loop
    do {
      System.out.println("Value of j: " + j);
      j++;
    } while (j < 10);
    System.out.println("Loop ended. Final value of j: " + j);
  }
}
