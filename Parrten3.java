import java.util.*;

class Pattern3 {

    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
    }
}