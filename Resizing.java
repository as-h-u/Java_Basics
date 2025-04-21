import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        numbers = Arrays.copyOf(numbers, 5); // resize to length 5
        
        numbers[3] = 40;
        numbers[4] = 50;

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
