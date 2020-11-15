package ru.zebra134.RTU.Pr20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<T> {
    private List<T> l = new ArrayList<>();

    public Conversion(T[] arr){
        l.addAll(Arrays.asList(arr));
    }

    public T return1 (int i){
        return l.get(i);
    }

    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }

    public void add(T a){
        l.add(a);
    }

    public List getList(){
        return l;
    }

    public void showList(){
        for (Object o: l){
            System.out.println(o);
        }
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "l=" + l +
                '}';
    }
}
