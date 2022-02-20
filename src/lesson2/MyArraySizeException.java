package lesson2;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super("This array size does not equal to 4x4");
    }
}
