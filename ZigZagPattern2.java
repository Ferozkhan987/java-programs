public class ZigZagPattern2 {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("new line");
        }
    }
}
