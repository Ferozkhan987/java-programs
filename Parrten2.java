import java.util.*;

class Pattern2 {

    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println(" ");
            for (int s=0; s<n-i+1; s++) {
            System.out.print(" ");
            }
    }
}
}