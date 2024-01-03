import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = List.of(10,10, 5, 2,2, 3);
        System.out.println(quickSort(integers)); //2,2,3,5,10,10
    }

    /**
     * O(n*n) || O(n log(n)) depends on pivot selection
     */
    private static List<Integer> quickSort(List<Integer> inputData) {
        if (inputData.size() < 2) {
            return inputData;
        }

        Integer pivot = inputData.get(0);

        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        for (int i = 1; i < inputData.size(); i++) {
            if (inputData.get(i) < pivot) {
                less.add(inputData.get(i));
            } else {
                more.add(inputData.get(i));
            }
        }

        List<Integer> lessSorted = quickSort(less);
        List<Integer> moreSorted = quickSort(more);

        List<Integer> result = new ArrayList<>(lessSorted);
        result.add(pivot);
        result.addAll(moreSorted);

        return result;
    }
}