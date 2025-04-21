public class AddTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        
        // Make sure both arrays are the same size
        int[] sumArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Print the result
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(sumArray[i]);
        }
    }
