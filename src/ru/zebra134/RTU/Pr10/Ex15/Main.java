package ru.zebra134.RTU.Pr10.Ex15;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        fun(a);
    }
    public static void fun(int a) {
        if (a > 0) {
            System.out.print(a % 10 + " ");
            fun(a / 10);
        }
    }
}
