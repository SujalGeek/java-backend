import java.util.Scanner;

// public class Test {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Please enter a number between 1 and 6 to get the corresponding day of the week:");
//     int number1 = scanner.nextInt();

//     switch (number1) {
//       case 1:
//         System.out.println("Monday");
//         break;
//       case 2:
//         System.out.println("Tuesday");
//         break;
//       case 3:
//         System.out.println("Wednesday");
//         break;
//       case 4:
//         System.out.println("Thursday");
//         break;
//       case 5:
//         System.out.println("Friday");
//         break;
//       case 6:
//         System.out.println("Saturday");
//         break;
//       case 7:
//         System.out.println("Sunday");
//         break;
//       default:
//         System.out.println("Invalid day number: " + number1);
//         break;
//     }
//   }
// }

class Computer {

  public void PlayMusic() {
    System.out.println("Playing music...");
  }

  public String getMeAPen(int cost) {
    if (cost >= 10) {
      return "Pen";
    }
    return "Nothing...";
  }
}

public class Test {
  public static void main(String[] args) {

    Computer computer = new Computer();
    computer.PlayMusic();
    Scanner scannner = new Scanner(System.in);
    System.out.println("Please enter the cost of the pen:");
    int cost = scannner.nextInt();
    // int cost = scanner.nextInt();
    String pen = computer.getMeAPen(cost);
    System.out.println("Received: " + pen);
  }
}