import java.util.*;

class Pattern5 {
    public static void main(String args[]) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); // || ||j == n || i == n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1) {
                    System.out.print("* ");
                } else if (i == n) {
                    System.out.print("* ");
                } else if (j == m) {
                    System.out.print("* ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }
}