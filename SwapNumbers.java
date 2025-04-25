import java.util.Scanner;

class SwapNumbers {
    public static void main(String args[]) {
        int x, a, z, y, temp;
        System.out.println("Enter z and y");
        Scanner sct = new Scanner(System.in); // User inputs two numbers
        z = sct.nextInt(); // User inputs two numbers
        y = sct.nextInt();
        x = 12;
        a = 21;
        System.out.println("Before Swapping\nz = " + z + "\ny = " + y);
        System.out.println("Before Swapping\na = " + a + "\nx = " + x);
        temp = z; // Swapping is done
        z = y;
        y = temp;
        System.out.println("After Swapping\nz = " + z + "\ny = " + y);
    }
}
