// package begineer;

public class Relational {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;

    boolean isEqual = number1 == number2;
    boolean isNotEqual = number1 != number2;
    boolean isGreater = number1 > number2;
    boolean isLess = number1 < number2;
    boolean isGreaterOrEqual = number1 >= number2;
    boolean isLessOrEqual = number1 <= number2;
    System.out.println("Equal: " + isEqual);
    System.out.println("Not Equal: " + isNotEqual);
    System.out.println("The " + number1 + " is greater than " + number2 + ": " + isGreater);
    System.out.println("The " + number1 + " is less than " + number2 + ": " + isLess);
    System.out.println("The " + number1 + " is greater of equal to " + number2 + ": " + isGreaterOrEqual);
    System.out.println("The " + number1 + " is less of equal to " + number2 + ": " + isLessOrEqual);
  }
}
