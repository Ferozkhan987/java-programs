import java.util.*;

class NewOne {
    public static void main(String args[]) {
        System.out.println("enter the numbers 1 for the number 2 for exit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int ni = 0;
        int z = 0;
        int num = functionForCOunting(n);
        System.out.println("the value of negitive num, positive num,zero are " + num);
    }

    public static int functionForCOunting(int n) {
        int p = 0, ni = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1: {
                int m = sc.nextInt();
                if (m > 0) {
                    p = p + 1;
                    functionForCOunting(m);
                    return p;

                } else if (m < 0) {
                    ni = ni + 1;
                    functionForCOunting(m);
                    return ni;
                } else if (m == 0) {
                    z = z + 1;
                    functionForCOunting(m);
                    return z;
                }
            }
            case 2: {
                System.out.println("exiting");
                return 0;
            }

        }

    }

}
