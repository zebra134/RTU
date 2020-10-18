package ru.zebra134.RTU.Pr10.Ex10;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fun(a, 0));
    }
    public static int fun(int a, int b) {
        if (a > 0) {
            b = b * 10 + a%10;
            return fun(a/10,b);
        }else return b;
    }
}