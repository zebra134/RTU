package ru.zebra134.RTU.Pr19.Ex2;

import java.util.List;

public class Students {
    public static boolean Search(List<Student> s, String fio) {
//        for (Student s1 : s) {
//            if (s1.compareTo(fio)) {
//                return true;
//            }
//        }
//        return false;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getFio() == fio) {
                return true;
            }
        }
        return false;
    }
}