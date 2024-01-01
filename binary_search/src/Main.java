import java.util.List;

public class Main {
    public static void main(String[] args) {
        var listOfIntegers = List.of(1,3,5,7,9); // list should be sorted.

        System.out.println(biSearch(listOfIntegers, 5)); // 2
        System.out.println(biSearch(listOfIntegers, -1)); // null
        System.out.println(biSearch(List.of(5), 5)); // null
    }

    /**
        binary search. O = logN
     works only with sorted input data.
     */
    private static Integer biSearch(List<Integer> data, Integer expectedNumber) {
        if (data.isEmpty()) {
            return null;
        }

        int low = 0;
        int high = data.size() - 1;

        while (low <= high) {
            int mid = (low + high) /2;
            int guess = data.get(mid);
            if (guess == expectedNumber) {
                return mid;
            } else if (guess > expectedNumber) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}