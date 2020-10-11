package ru.zebra134.RTU.Pr10.Ex3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (A<B){
            for (int i = A; i <= B; i++){
                System.out.print(i + " ");
            }
        }else{
            for (int i = A; i >= B; i--){
                System.out.print(i + " ");
            }
        }
    }
}
