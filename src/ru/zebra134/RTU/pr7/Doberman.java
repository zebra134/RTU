package ru.zebra134.RTU.pr7;

public class Doberman extends Dog{
    protected String character;
    protected boolean trained;

    public Doberman(int age, String character, boolean trained) {
        super(age);
        this.character = character;
        this.trained = trained;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "character='" + character + '\'' +
                ", trained=" + trained +
                ", age=" + age +
                '}';
    }
}
