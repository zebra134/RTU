package ru.zebra134.RTU.pr7;

import java.util.Arrays;

public class FurnitureShop {
    public Sofa[] sofas;
    public FurnitureShop(Sofa[] sofas){
        this.sofas = sofas;
    }

    public Sofa[] getSofas() {
        return sofas;
    }

    public void setSofas(Sofa[] sofas) {
        this.sofas = sofas;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "sofas=" + Arrays.toString(sofas) +
                '}';
    }
}
