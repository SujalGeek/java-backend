public class Type {
  public static void main(String[] args) {
    byte b = 127;
    int a = 526;
    // b = a; // Implicit narrowing conversion, may cause loss of data
    int c = b;
    System.out.println("Byte value: " + b);
    System.out.println("Int value: " + c);
    byte is_tostore_int = (byte) a;
    System.out.println("Int value after explicit cast to byte: " + is_tostore_int);
    // Implict conversion
    float f = 3.14f;
    double is_Implicit_conversion = f;
    System.out.println("Float value: " + f);
    System.out.println("Double value after implicit conversion: " + is_Implicit_conversion);
    // Type promotion
    byte number1 = 10;
    byte number2 = 30;
    int result = number1 * number2; // Type promotion occurs here
    System.out.println("Result of byte multiplication (promoted to int): " + result);
    // char c = "a";
    System.out.println("Character value: " + c);
  }

}
