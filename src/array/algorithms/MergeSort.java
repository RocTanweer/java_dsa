package array.algorithms;

public class MergeSort {
    private static void merge(int[] array, int low, int mid, int high) {
        int leftArrLen = mid - low + 1;
        int[] leftArray = new int[leftArrLen];
        int i;

        int rightArrLen = high - low;
        int[] rightArray = new int[rightArrLen];
        int j;

        for (i = 0; i < leftArrLen; i++) {
            leftArray[i] = array[low + i];
        }

        for (j = 0; j < rightArrLen; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        i = 0;
        j = 0;
        int k = low;

        while (i < leftArrLen && j < rightArrLen) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArrLen) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArrLen) {
            array[k++] = rightArray[j++];
        }
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }
}
