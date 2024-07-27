package array.algorithms;

import array.utils.Util;

public class QuickSort {
    private static int lomutoPartition(int array[], int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                Util.swap(array, array[i], array[j]);
            }
        }
        Util.swap(array, i + 1, high);
        return i + 1;
    }

    private static int hoarePartition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (i <= high && array[i] <= pivot);

            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                Util.swap(array, low, j);
                return j;
            }

            Util.swap(array, i, j);
        }
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            // int partitionIndex = lomutoPartition(array, low, high);
            int partitionIndex = hoarePartition(array, low, high);

            sort(array, low, partitionIndex - 1);
            sort(array, partitionIndex + 1, high);
        }
    }
}
