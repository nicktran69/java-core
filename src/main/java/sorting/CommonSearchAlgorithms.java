package sorting;

public class CommonSearchAlgorithms {

    /*
        *** Linear Search ***
        * Algorithmic complexity: T(n) = O(n)
     */
    public static int LinerSearch(int[] intArrs, int N) {
        int index = -1;
        for (int i = 0; i < intArrs.length; i++) {
            if (intArrs[i] == N)
                index = i;
        }
        return index;
    }

    public static int BinarySearch() {
        return 0;
    }

    public static void main(String[] args) {
        int intArrs[] = {1, 2, 3, 4, 5, 6};
        int index = LinerSearch(intArrs, 5);
        System.out.printf("Value has index: %d", index);
    }
}
