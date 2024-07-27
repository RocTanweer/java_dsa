package array.algorithms;

import array.utils.Util;

public class SelectionSort {
    public static void sort(int[] array, int currentSize) {
        for (int i = 0; i < currentSize - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < currentSize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            Util.swap(array, i, minIndex);
        }
    }
}
