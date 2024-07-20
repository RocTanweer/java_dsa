package array.operations;

public class Insertion {
    public static void insertElement(int[] array, int currentSize, int element, int index) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (currentSize >= array.length) {
            throw new IllegalArgumentException("Array is full");
        }

        for (int i = currentSize; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
    }
}
