package ru.zebra134.RTU.pr7;

public class Plate extends Dish {
    protected double diameter;
    protected boolean soup;

    public Plate(String color, String material, double diameter, boolean soup) {
        super(color, material);
        this.diameter = diameter;
        this.soup = soup;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean isSoup() {
        return soup;
    }

    public void setSoup(boolean soup) {
        this.soup = soup;
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
        return "Plate{" +
                "diameter=" + diameter +
                ", soup=" + soup +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
