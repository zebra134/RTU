package ru.zebra134.RTU.pr7;

public class Ladle extends Dish{
    protected double volume;
    protected double diameter;
    protected boolean haveLid;

    public Ladle(String color, String material, double volume, double diameter, boolean haveLid) {
        super(color, material);
        this.volume = volume;
        this.diameter = diameter;
        this.haveLid = haveLid;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public boolean isHaveLid() {
        return haveLid;
    }

    public void setHaveLid(boolean haveLid) {
        this.haveLid = haveLid;
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
        return "Ladle{" +
                "volume=" + volume +
                ", diameter=" + diameter +
                ", haveLid=" + haveLid +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}