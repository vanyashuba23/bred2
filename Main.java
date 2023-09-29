import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
       Scanner scanner = new Scanner (System.in);
       int number1= scanner.nextInt();
       int number2 = scanner.nextInt();
       int number3= scanner.nextInt();
       int max = number1;
       if (max < number2) {
           max = number2;
       }
       else if (max < number3) {
           max = number3;
       }
    System.out.println(max);
}
    }