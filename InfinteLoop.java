import java.util.*;

class InfinteLoop {
    public static void main(String args[]) {
        int a = 5;
        infinteLoop(a);
    }

    public static void infinteLoop(int a) {
        do {
            System.out.println(a);
        } while (a > 4);
    }
}