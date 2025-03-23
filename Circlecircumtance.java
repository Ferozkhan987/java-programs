import java.util.*;

class Circlecircumtance {
    public static void main(String args[]) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radious r ");
        r = sc.nextInt();
        double cir = circle(r);
        System.out.println("the circumtance of circle is " + cir);
    }

    public static double circle(int r) {
        double cc;
        cc = 3.142 * 2 * r;
        return cc;
    }
}