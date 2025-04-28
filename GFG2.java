import java.util.*;
import java.util.Arrays;

class GFG2 {
    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        System.out.println("printing the sorted array");
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
    }
}
