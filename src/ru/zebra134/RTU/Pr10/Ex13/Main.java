package ru.zebra134.RTU.Pr10.Ex13;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 1;
        while (n != 0) {
            if (b%2 != 0) System.out.println(n);
            n = scanner.nextInt();
            b++;
        }
        while (true){
            n = scanner.nextInt();
        }
    }
}
