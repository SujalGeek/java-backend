
public class Logical {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    int number3 = 30;
    int number4 = 40;

    boolean isResult = (number1 < number2) && (number3 < number4);
    boolean isResult1 = (number1 < number2) || (number3 < number4);
    boolean isResult2 = !(number1 < number2);
    boolean isResult3 = (number1 < number2) ^ (number3 < number4);
    System.out.println("Logical AND: " + isResult);
    System.out.println("Logical OR: " + isResult1);
    System.out.println("Logical NOT: " + isResult2);
    System.out.println("Logical XOR: " + isResult3);
  }
}
