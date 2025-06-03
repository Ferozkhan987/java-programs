import java.util.*;

class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = { 3, 8, 2, 10, 5, 245 };
        System.out.println("Largest: " + findLargest(num));
    }
}
