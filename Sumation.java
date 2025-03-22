import java.util.*;

class Sumation {
    public static void main(String args[]) {
        System.out.println("enter the value of A and B");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        summatationFunction(A, B);
        
    }

    public static void summatationFunction(int A, int B) {
        int sum;
        sum = A + B;
        System.out.println(sum);
        return ;
    }
}