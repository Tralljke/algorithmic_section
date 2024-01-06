import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] actual = { 5, 1, 6, 2, 3, 4 };
        bubbleSort(actual);
        System.out.println(Arrays.toString(actual));
    }

    /**
     * O(n * n) or O (n) for sorted collection
     */
    private static void bubbleSort(int[] inputData) {
        for (int i = inputData.length - 1; i > 0; i--) {
            for (int j = 0; j < inputData.length - 1; j++) {
                if (inputData[j] < inputData[j+1]) {
                    int swap = inputData[j];
                    inputData[j] = inputData[j+1];
                    inputData[j+1] = swap;
                }
            }
        }
    }
}