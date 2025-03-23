import java.util.*;

class AdultOrNot {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age a ");
        a = sc.nextInt();
        adultIsThere(a);
    }

    public static void adultIsThere(int a) {
        if (1 < a && a < 18) {
            System.out.println("not a adult");
        } else if (45 > a && a >= 18) {
            System.out.println("adult person");
        } else if (a > 45) {
            System.out.println("oldage person");
        } else {
            System.out.println("invalid age");
        }
    }
}