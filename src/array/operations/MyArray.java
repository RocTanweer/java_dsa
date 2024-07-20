package array.operations;

import java.util.Arrays;

import array.algorithms.*;

public class MyArray {
    private final int[] array;
    private int currentSize;

    public MyArray(int capacity) {
        array = new int[capacity];
        currentSize = 0;
    }

    public void initArray(int[] initialValue) {
        if (initialValue.length > array.length) {
            throw new IllegalArgumentException("Initial value exceeded array capacity");
        }

        System.arraycopy(initialValue, 0, array, 0, initialValue.length);

        currentSize = initialValue.length;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public void insert(int element, int index) {
        Insertion.insertElement(array, currentSize, element, index);
        currentSize++;
    }

    public void delete(int index) {
        Deletion.deleteElement(array, currentSize, index);
        currentSize--;
    }

    public void searchLinear(int element) {
        int index = LinearSearch.search(array, currentSize, element);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    public void searchBinary(int element) {
        int index = BinarySearch.search(array, currentSize, element);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
