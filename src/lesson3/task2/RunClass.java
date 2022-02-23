package lesson3.task2;

import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) {
        ArrayList<Apple> appleList1 = new ArrayList<>(10);
        Apple apple0 = new Apple(1.0);
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);
        Apple apple3 = new Apple(1.0);
        appleList1.add(apple0);
        appleList1.add(apple1);
        appleList1.add(apple2);
        appleList1.add(apple3);
        Box<Apple> box1 = new Box<>(appleList1);

        ArrayList<Apple> appleList2 = new ArrayList<>();
        appleList2.add(apple0);
        appleList2.add(apple1);
        appleList2.add(apple2);
        Box<Apple> box2 = new Box<>(appleList2);

        System.out.println(box2.getWeightList());
        System.out.println(box1.compareList(box2));
        box1.toEmptyList(box2);

        ArrayList<Orange> orangeList1 = new ArrayList<>(10);
        Orange orange0 = new Orange(1.5);
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);
        orangeList1.add(orange0);
        orangeList1.add(orange1);
        orangeList1.add(orange2);
        Box<Orange> box3 = new Box<>(orangeList1);

        ArrayList<Orange> orangeList2 = new ArrayList<>(10);
        orangeList2.add(orange0);
        orangeList2.add(orange1);
        orangeList2.add(orange2);
        Box<Orange> box4 = new Box<>(orangeList2);

        System.out.println(box3.getWeightList());
        System.out.println(box3.compareList(box4));
        box3.toEmptyList(box4);
    }
}