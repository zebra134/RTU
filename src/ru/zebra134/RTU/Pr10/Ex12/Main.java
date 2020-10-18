package ru.zebra134.RTU.Pr10.Ex12;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            if (n %2 != 0) System.out.println(n);
            n = scanner.nextInt();
        }
        int b = 0;
        while (b == 0){
            n = scanner.nextInt();
        }
    }
}
