package lesson2;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int row, int col) {
        super(String.format("Invalid data type in the cell [%d,%d]", row, col));
    }
}
