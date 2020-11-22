package ru.zebra134.RTU.Pr23.Ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Абрамов", "Константин");
        dictionary.put("Богатырёв", "Владимир");
        dictionary.put("Володин", "Степан");
        dictionary.put("Ивушкина", "Ольга");
        dictionary.put("Носов", "Артём");
        dictionary.put("Скалацкая", "Полина");
        dictionary.put("Червакова", "Варвара");
        dictionary.put("Морозова", "Варвара");
        dictionary.put("Герасимов", "Артём");

        Map<String, String> dictionary2 = new HashMap<>();
        for (Iterator<String> iterator = dictionary.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = dictionary.get(key);
            if (!dictionary2.containsValue(value))
                dictionary2.put(key, value);
        }
        System.out.println(dictionary2);
    }
}