//Irina Khromova Java Core HW2

package lesson2;

public class HomeWork2 {

    public static void main(String[] args) {

        String[][] invalidArraySizeI = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"}
        };
        String[][] invalidArraySizeJ = {
                {"0", "1", "2"},
                {"4", "5", "6"},
                {"8", "9", "10"},
                {"12", "13", "14"}
        };
        String[][] invalidArrayChar = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "1o", "11"},
                {"12", "13", "14", "15"}
        };
        String[][] correctArray = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}
        };

        try {
            System.out.println("Array elements sum = " + Converter.strConverter(invalidArraySizeI));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Array elements sum = " + Converter.strConverter(invalidArraySizeJ));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Array elements sum = " + Converter.strConverter(invalidArrayChar));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Array elements sum = " + Converter.strConverter(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
