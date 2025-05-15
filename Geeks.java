
// Java program to take an integer
// as input and print it
import java.io.*;
import java.util.Scanner;

// Driver Class
class Geeks {
    // main function
    public static void main(String[] args) {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);
        System.out.println("You entered integer ");
        // Read the next integer from the screen
        num = s.nextInt();

        // Display the integer
        System.out.println("Entered integer is: " + num);

        // Close the Scanner object
        s.close(); // Important to prevent resource leaks
    }

    public static void main(String[] args)
            throws IOException {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String s = r.readLine();

        // Printing the read line
        System.out.println(s);
    }

    public static void main(String args[]) {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);
        System.out.println("You entered integer ");
        int a = s.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("You entered float ");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner scanner = new Scanner(System.in);
        System.out.println("You entered string value ");
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        System.out.println("You entered string " + s);
    }
}