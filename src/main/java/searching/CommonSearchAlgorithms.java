package searching;

public class CommonSearchAlgorithms {

    /**
     * *** Linear Search ***
     * Algorithmic complexity: T(n) = O(n)
     *
     * @param intArr
     * @param N
     * @return
     */
    public static int LinearSearch(int[] intArr, int N) {
        int index = -1;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == N)
                index = i;
        }
        return index;
    }

    /**
     *** Binary Search ***
     * Algorithmic complexity: T(n) = O(log2 n)
     * Require: sort before search, re-sort if has changed => consider between LinearSearch and BinarySearch
     * @param orderedIntArr
     * @param N
     * @return
     */
    public static int BinarySearch(int[] orderedIntArr, int N) {
        int index = -1;
        int left = 0;
        int right = orderedIntArr.length;
        int middle = (left + right) / 2;

        if (orderedIntArr[middle] == N) {
            index = middle;
        } else if (N < orderedIntArr[middle]) {
            for (int i = left; i < middle; i++) {
                if(orderedIntArr[i] == N) {
                    index =  i;
                }
            }
        } else {
            for (int i = middle; i < right; i++) {
                if(orderedIntArr[i] == N) {
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int intArrs[] = {1, 2, 3, 4, 5, 6};
        int indexLinearSearch = LinearSearch(intArrs, 5);
        System.out.printf("Value has index: %d", indexLinearSearch);
        System.out.println();

        int indexBinarySearch = BinarySearch(intArrs, 5);
        System.out.printf("Value has index: %d", indexBinarySearch);
    }
}
