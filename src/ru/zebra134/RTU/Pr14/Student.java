package ru.zebra134.RTU.Pr14;

import java.util.List;
import java.util.Objects;

public class Student implements Test {
    private int iDNumber;
    private double gpa;
    private static int k = 0;

    public Student(double gpa) {
        k++;
        this.gpa = gpa;
        this.iDNumber = k;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iDNumber == student.iDNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpa);
    }

    public static void linearSearch(List<Student> students, double number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < students.size(); i++) {
            if (number == students.get(i).getGpa()) {
                System.out.println("Линейный поиск: " + "\n" + number + " это " + (i + 1) + " элемент в массиве");
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                System.out.println("Время поиска: " + elapsed + " нc");
                break;
            }
        }
    }


    public static void binarySearch(List<Student> students, int first, int last, double key) {
        long start = System.currentTimeMillis();
        int pos;

        pos = (first + last) / 2;

        while ((students.get(pos).getGpa() != key) && (first <= last)) {
            if (students.get(pos).getGpa() <= key)
                last = pos - 1;
            else
                first = pos + 1;
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Бинарный поиск: "+"\n"+key + " это " + ++pos + " элемент в массиве");
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Время поиска: "+elapsed+" нc");
        }
        else
            System.out.println("Элемент в массиве не найден");
    }
}
