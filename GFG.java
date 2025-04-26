
// Java program to compute
// simple interest for given principal
// amount, time and rate of interest.
import java.io.*;

class GFG {
    public static void main(String args[]) {
        // We can change values here for
        // different inputs
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter principal value");
        float P =sc.nextInt();
        
        System.out.println(" enter rate value");
        R =sc.nextInt();
        System.out.println(" enter time value");
        T = sc.nextInt();

        // Calculate simple interest
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
