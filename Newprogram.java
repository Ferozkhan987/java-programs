import java.util.*;

class Newprogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int pow = powerNum(n, x);
        System.out.println("the power of both is " + pow);// printing the output
    }

    public static int powerNum(int n, int x) {
        int pow = 1;
        for (int i = 0; i < x; i++) {
            pow = n * pow;
        }
        return pow;
    }
}