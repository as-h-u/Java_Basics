import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
