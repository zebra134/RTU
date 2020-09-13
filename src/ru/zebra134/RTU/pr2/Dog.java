package ru.zebra134.RTU.pr2;

public class Dog {

    private String petName;
    private int age;

    public Dog(String petName, int age) {
        this.petName = petName;
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                ", age=" + age +
                '}';
    }
    public int translate(){
        return this.age *=7;
    }
}
