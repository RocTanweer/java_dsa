package array.algorithms;

import array.utils.Util;

public class BubbleSort {
    public static void sort(int[] array, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            boolean swapped = false;

            for (int j = 0; j < currentSize - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
