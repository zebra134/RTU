package ru.zebra134.RTU.Pr10.Ex11;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int k = 0;
        int n = scanner.nextInt();
        if (n == 0) k++;
        while (k != 2) {
            if (n != 0) k = 0;
            if (n == 1) a++;
            n = scanner.nextInt();
            if (n == 0) k++;
        }
        System.out.println(a);
        while (k == 2){
            n = scanner.nextInt();
        }
    }
}