package ru.zebra134.RTU.Pr10.Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        rec(n,2);
    }
    static void rec(int n, int i){
        if (i!=n) {
            if (n % i == 0) {
                System.out.print("NO");
            }else{
                rec(n,i+1);
            }
        }else{
            System.out.print("YES");
        }
    }
}
