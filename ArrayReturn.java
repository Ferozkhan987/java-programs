import java.util.*;

class ArrayReturn {
    // Function to return an array of integers
    public static int[] getArray() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

    public static void main(String[] args) {
        int[] numbers = getArray();
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
