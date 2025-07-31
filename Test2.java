class Computer1 {

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public double add(double n1, int n2) {
    return n1 + n2;
  }
}

public class Test2 {
  public static void main(String[] args) {
    Computer1 comp = new Computer1();

    int result = comp.add(4, 5);
    int result2 = comp.add(4, 5, 6);
    double result3 = comp.add(4, 7);
    System.out.println("Result of two parameters(int): " + result);
    System.out.println("Result of three parameters(int): " + result2);
    System.out.println("Result of one double and one int paramter: " + result3);
  }
}
