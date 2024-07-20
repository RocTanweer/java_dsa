package array.algorithms;

public class LinearSearch {
    public static int search(int[] array, int currentSize, int target) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
