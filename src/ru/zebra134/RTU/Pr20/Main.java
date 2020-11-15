package ru.zebra134.RTU.Pr20;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> arr1 = new Conversion(num);
        arr1.showList();
        arr1.show();

        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Conversion<String> arr2 = new Conversion(str);
        arr2.showList();
        arr2.show();
    }
}
