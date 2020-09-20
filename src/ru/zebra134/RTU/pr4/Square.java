package ru.zebra134.RTU.pr4;

public class Square extends Rectangle {
    protected double side;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super (side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
