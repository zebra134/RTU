package ru.zebra134.RTU.Pr15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("word1");
        array1.add("word2");
        array1.add("word3");
        for (String a: array1){
            System.out.println(a);
        }
        System.out.println();

        LinkedList<String> array2 = new LinkedList<String>();
        array2.add("word4");
        array2.add("word5");
        array2.add("word6");
        for (String b: array2){
            System.out.println(b);
        }
        System.out.println();
        ArrayList1<String> array3 = new ArrayList1<String>();
        array3.add("word7");
        array3.add("word8");
        array3.add("word9");
        for (int i=0;i<array3.size();i++) {
            System.out.println(array3.get(i));
        }
    }
}
