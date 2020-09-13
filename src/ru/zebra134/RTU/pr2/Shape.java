package ru.zebra134.RTU.pr2;

public class Shape {
    private String color;
    private int sidesCount;
    public Shape(String color, int sidesCount) {
        this.color=color;
        this.sidesCount=sidesCount;
    }
    public String getColor() {
        return color;
    }
    public int getSidesCount() {
        return sidesCount;
    }
    public void setColor(String color) {
        if (Math.random()>50) {
            this.color=color;
        }
    }
}
