package ru.zebra134.RTU.Pr16;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    public static void main(String[] args){
        ArrayList<Integer> first = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            first.add(scan.nextInt());
        }
        ArrayList<Integer> second = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            second.add(scan.nextInt());
        }

        int k = 0;
        boolean win = false;

        while ((k<106) && (win == false)){
            if ((first.size() != 0) && (second.size() != 0)){
                if (first.get(0) < second.get(0) || ((first.get(0) == 9) && (second.get(0) == 0))){
                    second.add(first.get(0));
                    second.add(second.get(0));
                }else if (first.get(0) > second.get(0) || ((first.get(0) == 0) && (second.get(0) == 9))){
                    first.add(first.get(0));
                    first.add(second.get(0));
                }
                first.remove(0);
                second.remove(0);
            }else if(first.size()==0){
                System.out.println("second " + k);
                win = true;
            }else if(second.size()==0){
                System.out.println("first " + k);
                win = true;
            }
            k++;
        }
        if ((k == 106) || (win == false)){
            System.out.println("Botva!");
        }
    }
}