import java.util.*;

class Sumof1Ton {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers n");
        n = sc.nextInt();
        int sum = 0;
        int ss = sumationofn(n, sum);
        System.out.println(ss);
    }

    public static int sumationofn(int n, int sum) {
        for (int i = 0; i <= n; i++) {
            sum=sum + i;  

        }
        return sum;
    }
}