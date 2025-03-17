import java.util.*;

class Pattern9 {
    public static void main(String args[]) {
        System.out.println("enter the number of number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (f == 1) {
                    System.out.print("0 ");
                    f = 0;
                } else {
                    System.out.print("1 ");
                    f = 1;
                }
            }
            System.out.println();
        }
    }
}