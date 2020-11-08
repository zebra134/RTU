package ru.zebra134.RTU.Pr19.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Students{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5.0, "qwerty"));
        students.add(new Student(4.9, "werty"));
        students.add(new Student(4.7, "erty"));
        students.add(new Student(3.2, "rty"));
        students.add(new Student(4.4, "ty"));
        students.add(new Student(3.8, "y"));
        students.add(new Student(4.2, "u"));

        Student[] st = students.toArray(new Student[0]);
        for (Student s: st) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        try {
                if (Search(students, "werty")) {
                    System.out.println("Found");
                } else {
                    throw (new Exception());
                }
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}
