package ru.zebra134.RTU.pr3.ex2;

public class Leg {
    private int size;
    private boolean strong;

    public Leg(int size, boolean strong) {
        this.size = size;
        this.strong = strong;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isStrong() {
        return strong;
    }

    public void setStrong(boolean strong) {
        this.strong = strong;
    }
}
