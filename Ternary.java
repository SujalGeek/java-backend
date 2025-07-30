public class Ternary {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    int number3 = 30;

    if (number1 > number2 && number1 > number3) {
      System.out.println("Number 1 is the greatest " + number1);
    } else if (number2 > number1 && number2 > number3) {
      System.out.println("Number 2 is the greatest " + number2);
    } else {
      System.out.println("Number 3 is the greatest " + number3);
    }
  }
}
