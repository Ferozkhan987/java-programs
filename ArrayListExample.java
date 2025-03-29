import java.util.*;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("Programming Languages:");
        for (String lang : list) {
            System.out.println(lang);
        }

        list.remove("C++");
        System.out.println("After removal: " + list);
    }
}
