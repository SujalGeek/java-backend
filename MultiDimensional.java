public class MultiDimensional {
  public static void main(String[] args) {
    int[][] nums = new int[3][4];

    // Fill the array with random numbers
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        nums[i][j] = (int) (Math.random() * 100); // 0 to 99
        System.out.println("Filled: nums[" + i + "][" + j + "] = " + nums[i][j]);
      }
    }

    // Print the array
    System.out.println("\nPrinting the array:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println("nums[" + i + "][" + j + "] = " + nums[i][j]);
      }
    }
  }
}
