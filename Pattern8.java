import java.util.*;

class Pattern8 {
    public static void main(String args[]) {
        System.out.println("enter the number of number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + "  ");
            }
            System.out.println();
        }
    }
}