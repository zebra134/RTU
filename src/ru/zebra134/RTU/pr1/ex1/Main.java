package ru.zebra134.RTU.pr1.ex1;

public class Main {

    public static void main(String[] args) {
        int array []={1, 2, 3, 4, 5};
        int k=0;
        for (int i=0; i<array.length; i++ ) {
            k=k+array[i];
        }
        System.out.println(k);
        int l=0;
        int j=0;
        while (j<array.length) {
            l=l+array[j];
            j++;
        }
        System.out.println(l);
        int m=0;
        int b=0;
        do {
            m=m+array[b];
            b++;
        } while (b<array.length);
        System.out.println(m);

    }
}