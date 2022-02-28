package lesson4.task2;

public class MainClass {

    public static void main(String[] args) {
        PhoneTableClass phoneTableClass = new PhoneTableClass();
        phoneTableClass.add("1235", "Ivanov");
        phoneTableClass.add("6789", "Ivanov");
        phoneTableClass.add("1011", "Petrov");
        phoneTableClass.add("1213", "Sidorov");


        System.out.println(phoneTableClass.getPhoneByFIO("Ivanov"));
        System.out.println(phoneTableClass.getPhoneByFIO("Khromova"));
    }
}