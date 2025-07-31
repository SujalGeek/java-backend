public class JaggedArray {
  public static void main(String[] args) {

    int arr[][] = new int[3][];

    arr[0] = new int[3];
    arr[1] = new int[2];
    arr[2] = new int[4];

    // Fill the jagged array with random numbers
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int) (Math.random() * 100);
        System.out.println(arr[i][j] + " ");
      }
    }
    System.out.println("Printing the jagged array: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
    }
    System.out.println("Enchaned for loop: ");
    // Enchaned for loop
    for (int n[] : arr) {
      for (int m : n) {
        System.out.println(m + " ");
      }
    }
  }

  // for(int i=)
}
