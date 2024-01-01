import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(10);
        integers.add(3);
        integers.add(2);

        System.out.println(doSelectionSort(integers)); //2,3,5,6,10
    }

    private static List<Integer> doSelectionSort(List<Integer> inputData) {
        var result = new ArrayList<Integer>(inputData.size());
        int size = inputData.size();
        for (int i = 0; i < size; i++) {
            Integer smallestIndex = findSmallest(inputData);
            result.add(inputData.remove(smallestIndex.intValue()));
        }
        return result;
    }

    private static Integer findSmallest(List<Integer> inputData) {
        int smallestValue = inputData.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < inputData.size(); i++) {
            if (inputData.get(i) < smallestValue) {
                smallestValue = inputData.get(0);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}