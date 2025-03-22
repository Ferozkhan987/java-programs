import java.util.*;

class NameFunction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.nextLine();
        printMyName(name);

    }

    public static void printMyName(String name) {
        System.out.println("the given name is:");
        System.out.println(name);
        return;
    }
}