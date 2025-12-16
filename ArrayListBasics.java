import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");

        System.out.println("Initial ArrayList: " + fruits);

        String first = fruits.get(0);
        System.out.println("First Element: " + first);

        fruits.set(1, "Blueberry");
        System.out.println("After updating second element: " + fruits);

        fruits.remove(2);
        System.out.println("After removing third element: " + fruits);

        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
