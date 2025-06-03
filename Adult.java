import java.util.*;

class Adult {
    public static void main(String args[]) {
        int age;
        System.out.println("enter the age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age => 18) {
            System.out.println("Adult");
        } else {
            System.out.println("not adult");
        }

    }
}