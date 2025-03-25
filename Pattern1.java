import java.util.*;

class Pattern1 {
    public static void main(String args[]) {
        System.out.println("enter the number of stars");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}