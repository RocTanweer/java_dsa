package array.algorithms;

public class BinarySearch {
    public static int search(int[] array, int currentSize, int target) {
        int left = 0;
        int right = currentSize - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
