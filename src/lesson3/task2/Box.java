package lesson3.task2;

import java.util.ArrayList;

public class Box<T extends Fruit>{

    ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public Double getWeightList(){
        Double result = 0.0;
        for(T t: getFruitList()){
            if(t!=null) {
                Double value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compareList(Box<T> box){
        if(this.getWeightList().doubleValue() == box.getWeightList().doubleValue()) return true;
        return false;
    }

    public void toEmptyList(Box<T> box){
        System.out.println("В первой коробке до: " + this.getWeightList());
        System.out.println("Во второй коробке до: " + box.getWeightList());
        for(T t: box.getFruitList()){
            this.getFruitList().add(t);
        }
        box.getFruitList().clear();
        System.out.println("В первой коробке после: " + this.getWeightList());
        System.out.println("Во второй коробке после: " + box.getWeightList());
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }
}