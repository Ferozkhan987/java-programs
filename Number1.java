import java.util.*;

class Number1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fabinocaniSeries(n);

    }

    public static void fabinocaniSeries(int n) {
        int m = 0;
        int s = 1;
        int fac = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + fac);
            fac = m + s;
            m = s;// assign the number
            s = fac;

        }
    }
}