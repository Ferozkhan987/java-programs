import java.util.*;

class Pattern7 {
    public static void main(String args[]) {
        System.out.println("enter the number of number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j + " ");

            }
            System.out.println(" ");

        }
    }
}