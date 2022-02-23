package lesson3.task2;

public abstract class Fruit {

    private String name;
    private Double weight;

    public Fruit(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }
}