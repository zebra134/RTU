package ru.zebra134.RTU.Pr10.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        rec(n,0);
    }
    static void rec(int n, int k){
        if (n!=0){
            k+=n%10;
            rec(n/10,k);
        }else{
            System.out.print(k);
        }
    }
}
