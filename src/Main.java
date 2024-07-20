import array.operations.*;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(10);

        // Define an array
        int[] initArrayValue = { 1, 2, 3, 4, 5 };
        array.initArray(initArrayValue);

        array.searchLinear(40);
        array.searchBinary(5);
    }
}
