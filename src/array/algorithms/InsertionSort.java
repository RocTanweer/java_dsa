package array.algorithms;

public class InsertionSort {
    public static void sort(int[] array, int currentSize) {
        for (int i = 1; i < currentSize; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
