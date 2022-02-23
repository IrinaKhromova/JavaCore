package lesson3.task1;

import java.util.Arrays;

public class TaskMain {

    static String[] arrayString = {"A", "B", "C", "D"};
    static Integer[] arrayInteger = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayString, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayInteger, 0, 5)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
