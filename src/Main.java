import array.operations.*;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(10);

        // Define an array
        int[] initArrayValue = { 3, 2, 1, 5, 4 };
        array.initArray(initArrayValue);

        array.printArray();

        // array.bubbleSort();
        // array.selectionSort();
        // array.insertionSort();
        // array.quickSort();
        array.mergeSort();

        array.printArray();
    }
}
