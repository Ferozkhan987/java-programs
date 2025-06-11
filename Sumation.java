import java.util.*;

class Sumation {
    public static void main(String args[]) {
        System.out.println("enter the value of A and B");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = summatationFunction(A, B);
        System.out.println("the total sum is");
        System.out.println(sum);

    }

    public static int summatationFunction(int A, int B) {
        int sum;
        sum = A + B;
        return sum;
    }
}