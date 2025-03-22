import java.util.*;

class Multaplication {
    public static void main(String args[]) {
        System.out.println("enter the value of A and B");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int mul = summatationFunction(A, B);
        System.out.println(mul);

    }

    public static int summatationFunction(int A, int B) {
        int mul;
        mul = A * B;
        return mul;
    }
}