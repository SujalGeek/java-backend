class Calculator {
  public int add(int n1, int n2) {
    // int num1 = 10;
    // int num2 = 20;
    int result = n1 + n2;
    return result;
  }
}

public class Class {
  public static void main(String[] args) {

    Calculator c = new Calculator();
    int result = c.add(4, 5);
    System.err.println("Result: " + result);
  }
}
