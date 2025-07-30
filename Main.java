package begineer;

public class Main {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    char c = 's';
    int sum = num1 + num2;
    float num3 = 3.14f;
    double num4 = 5.6;
    boolean isTrue = true;
    System.out.println("Sum: " + sum);
    System.out.println("Float: " + num3);
    System.out.println("Double:" + num4);
    System.out.println("Hello,World!");
    // size of int , float, double, char in bytes
    System.out.println("Size of int: " + Integer.BYTES);
    System.out.println("Size of float: " + Float.BYTES);
    System.out.println("Size of double: " + Double.BYTES);
    System.out.println("Size of char: " + Character.BYTES);
  }
}
