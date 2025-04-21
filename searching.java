import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(numbers, 30);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
