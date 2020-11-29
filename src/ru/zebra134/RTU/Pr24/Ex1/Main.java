package ru.zebra134.RTU.Pr24.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        Person person = new Person(scanner.nextLine());
        try {
            person.setVse();
        }catch (Exception ex){
            System.out.println("\"Отсутствует Имя и/или Отчество\"");
        }finally {
            System.out.println("Фамилия человека: " + person.getSurname());
        }
    }
}
