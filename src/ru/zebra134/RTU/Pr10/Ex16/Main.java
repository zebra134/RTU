package ru.zebra134.RTU.Pr10.Ex16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(rec(a));
    }

    public static int rec(int a) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = n;
        int k = 1;
        while (n != 0) {
            if (n == max) k++;
            if (n > max) {
                max = n;
                k = 1;
            }
            n = scan.nextInt();
        }
        a = k;
        return a;
    }
}