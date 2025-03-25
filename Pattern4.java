import java.util.*;

class Pattern4 {
    public static void main(String args[]) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number of col");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || j == m - 1 || i == n - 1) {
                    System.out.print("*  ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}