package ru.zebra134.RTU.pr7;

public class Sofa extends Furniture{
    protected String size;
    protected String material;
    protected String color;

    public Sofa(int price, String size, String material, String color) {
        super(price);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
