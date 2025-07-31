class Student {
  public void Message() {
    System.out.println("Hello");
  }
}

public class Loops {
  public static void main(String[] args) {
    int arr[] = new int[4];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100);
    }
    for (int nums : arr) {
      System.out.println(nums);
    }
    Student stud[] = new Student[3];
    // stud[0] = s2;

  }

}
