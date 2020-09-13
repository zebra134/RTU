package ru.zebra134.RTU.pr1.ex5;

public class Main {
    public static void main(String[] args) {
        myMethod(10);
    }
    public static void myMethod(int a) {
        int b=1;
        for (int i=1; i<=a; i++) {
            b=b*i;
        }
        System.out.println(b);
    }
}