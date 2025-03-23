import java.util.*;

class GreaterNum {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers a b ");
        a = sc.nextInt();
        b = sc.nextInt();
        int gr = greaterOfNum(a, b);
        System.out.println("the greater number is " + gr);
    }

    public static int greaterOfNum(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}