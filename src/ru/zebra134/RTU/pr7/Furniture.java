package ru.zebra134.RTU.pr7;

public abstract class Furniture {
    protected int price;

    public Furniture() {
    }

    public Furniture(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                '}';
    }
}
