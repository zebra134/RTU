package ru.zebra134.RTU.Pr29;

public interface Item {
    int getCost();
    void setCost(int cost);
    String getName();
    void setName(String name);
    Dish getDescription();
    void setDescription(Dish description);
}