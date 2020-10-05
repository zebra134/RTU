package ru.zebra134.RTU.pr7;

public class Main {
        public static void main (String[] args) {
        Sofa sofa1 = new Sofa(1000, "small", "leather", "brown");
        System.out.println(sofa1);
        Furniture sofa2 = sofa1;
        ((Sofa)sofa2).setColor("red");
        System.out.println((Sofa)sofa2);
        Sofa[] sofas = new Sofa[2];

        sofas[0] = sofa1;
        sofas[1]= (Sofa)sofa2;
        FurnitureShop shop = new FurnitureShop(sofas) {};
        System.out.println(shop);
        }
}
