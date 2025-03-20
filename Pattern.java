import java.util.*;

class Pattern {

    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.println(" ");
        }

    }
}