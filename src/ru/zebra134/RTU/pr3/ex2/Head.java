package ru.zebra134.RTU.pr3.ex2;

public class Head {
    private int IQ;
    private boolean hair;
    private String size;
    private String hairColor;

    public Head(int IQ, boolean hair, String size, String hairColor) {
        this.IQ = IQ;
        this.hair = hair;
        this.size = size;
        this.hairColor = hairColor;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "IQ=" + IQ +
                ", hair=" + hair +
                ", size='" + size + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
