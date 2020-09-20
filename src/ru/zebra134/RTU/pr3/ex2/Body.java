package ru.zebra134.RTU.pr3.ex2;

public class Body {
    private int height;
    private double weight;
    private String size;

    public Body(int height, double weight, String size) {
        this.height = height;
        this.weight = weight;
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Body{" +
                "height=" + height +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                '}';
    }
}
