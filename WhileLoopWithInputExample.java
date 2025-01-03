import java.util.Scanner;

public class WhileLoopWithInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to add to the sum. Type 0 to finish.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sum += number;
        }

        System.out.println("Total sum is: " + sum);
    }
}
