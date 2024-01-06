import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] integers = {10,5,2,5,3};

        System.out.println(Arrays.toString(insertionSort(integers))); //2,3,5,5,10
    }

    /** O(n * n)
     */
    private static int[] insertionSort(int[] inputData) {
        int j;
        for (int i = 1; i < inputData.length; i++) {
            int swap = inputData[i];
            for (j = i; j > 0 && swap < inputData[j - 1]; j--) {
                inputData[j] = inputData[j - 1];
            }
            inputData[j] = swap;
        }



        return inputData;
    }
}