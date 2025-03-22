import java.util.*;

class Factorial {
    public static void main(String args[]) {
        System.out.println("enter the value of A ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = factorialnum(A);
        System.out.println(B);

    }

    public static int factorialnum(int A) {
        if (A == 0) {
            return 1;
        } else if (A < 0) {
            System.out.println("invalid number");
            return 0;
        } else {
            int fac = factorialnum(A - 1);
            int B = A * fac;
            return B;
        }
    }
}