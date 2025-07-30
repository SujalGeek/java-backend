public class Condinatial {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    if (number1 > number2) {
      System.out.println("Number1 is greater than Number2 and the number is " + number1);
    } else if (number1 < number2) {
      System.out.println("Number2 is greater than Number1 and number is " + number2);
    } else {
      System.out.println("Both numbers are equal: " + number1 + " and " + number2);
    }
  }
}
