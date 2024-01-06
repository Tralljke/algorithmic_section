import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        mergeSort(actual, actual.length);
        System.out.println(Arrays.toString(actual));
    }

    private static void mergeSort(int[] inputData, int inputDataLength) {
        if (inputDataLength < 2) {
            return;
        }
        int mid = inputDataLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputDataLength - mid];

        System.arraycopy(inputData, 0, leftArray, 0, mid);
        System.arraycopy(inputData, mid, rightArray, 0, inputDataLength - mid);

        mergeSort(leftArray, mid);
        mergeSort(rightArray, inputDataLength - mid);

        merge(inputData, leftArray, rightArray, mid, inputDataLength - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}