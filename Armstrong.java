import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");

        scanner.close();
    }
}
