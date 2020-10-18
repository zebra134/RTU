package ru.zebra134.RTU.Pr10.Ex9;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(fun(a, b));
    }
    public static int fun(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return fun(a, b - 1) + fun(a - 1, b - 1);
    }
}
