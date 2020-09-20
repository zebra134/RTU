package ru.zebra134.RTU.pr3.ex2;

public class Hand {
    private String length;
    private String clean;

    public Hand(String length, String clean) {
        this.length = length;
        this.clean = clean;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length='" + length + '\'' +
                ", clean='" + clean + '\'' +
                '}';
    }
}
