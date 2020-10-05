package ru.zebra134.RTU.pr7;

public class Fork extends Dish {
    protected double length;

    public Fork(String color, String material, double length) {
        super(color, material);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public String toString() {
        return "Fork{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
