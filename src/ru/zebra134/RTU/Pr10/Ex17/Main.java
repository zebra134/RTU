package ru.zebra134.RTU.Pr10.Ex17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(rec(n));
    }

    public static int rec(int n) {
        Scanner scan = new Scanner(System.in);
        int max = n;
        while (n != 0) {
            if (n > max) {
                max = n;
            }
            n = scan.nextInt();
        }
        n = max;
        return n;
    }
}