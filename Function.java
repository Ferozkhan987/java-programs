import java.util.*;

class Function {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers a b c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        float avg = avgNums(a, b, c);
        System.out.println(avg);
    }

    public static float avgNums(int a, int b, int c) {
        int avg= (a+b+c)/3;
        return  avg ;     
    }
}