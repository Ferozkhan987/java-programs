import java.util.*;

public class ReverseString {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();// used the reverse function
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverse("hello world my name is zoref"));
    }
}
