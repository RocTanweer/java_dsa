package array.operations;

public class Deletion {
    public static void deleteElement(int[] array, int currectSize, int index) {
        if (index < 0 || index >= currectSize) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        if (currectSize == 0) {
            System.out.println("Array is already empty");
            return;
        }

        for (int i = index; i < currectSize - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
