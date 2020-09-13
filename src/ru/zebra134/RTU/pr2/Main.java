package ru.zebra134.RTU.pr2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 4);
        Dog dog2 = new Dog("Rex", 2);
        Dog dog3 = new Dog("Skooby", 3);
        Dog dog4 = new Dog("Nock", 4);
        DogKennel nursery = new DogKennel();
        nursery.plus(dog1, dog2, dog3, dog4);
        System.out.println(dog1.translate());
    }
}