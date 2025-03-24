import java.util.*;

class NewOne {
    public static void main(String args[]) {
        System.out.println("enter the numbers 1 for the number 2 for exit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0, ni = 0, z = 0;
        functionForCOunting(n);

    }

    public static void functionForCOunting(int n) {
        int p = 0, ni = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1: {
                int m = sc.nextInt();
                if (m > 0) {
                    p = p + 1;
                    functionForCOunting(m);
                    
                }  else if (m < 0) {
                    ni = ni + 1;
                    int m = sc.nextInt();
                } else (m == 0) {
                    z = z + 1;
                    int m = sc.nextInt();
                }
                case 2 : {
                    return;
                }
        
            }
           
        }
        
    }

}
