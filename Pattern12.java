import java.util.*;

class Pattern12 {
    public static void main(String args[]) {
        System.out.println("enter the number of number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(" *");
                } else if (i == j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(" *");
                } else if (i == j) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
