package ru.zebra134.RTU.Pr10.Ex14;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        fun(a);
    }
    public static void fun(int a) {
        if (a > 9) fun(a / 10);
        System.out.print(a % 10 + " ");
    }
}
