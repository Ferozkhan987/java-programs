import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
