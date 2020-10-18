package ru.zebra134.RTU.Pr11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame{
    public int k = 0;
    public int b = 0;
    Window(){
        super("Example");
        Random random = new Random();
        int numb = random.nextInt(20);
        JButton check = new JButton("Проверка значения");
        JButton exit = new JButton("Закрыть");
        JTextField field = new JTextField("Введите значение", 20);
        field.setFont(new Font("Times new roman", Font.PLAIN, 20));
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBounds(85,100,320,40);
        check.setBounds(85,160,320,40);
        exit.setBounds(85,290,320,40);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        exit.setVisible(false);
        add(check);
        add(field);
        add(exit);
        JTextField field1 = new JTextField ("Результат угадывания",10);
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setFont(new Font("Dialog", Font.PLAIN, 20));
        field1.setBounds(85,230,320,30);
        add(field1);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(field.getText());
                if (n>numb){
                    field1.setText("Загаданное число меньше");
                }else if (n<numb){
                    field1.setText("Загаданное число больше");
                }else{
                    field1.setText("Вы угадали");
                    exit.setVisible(true);
                    check.setVisible(false);
                    b++;
                }
                k++;
                if ((k==3)&&(b == 0)){
                    field1.setText("Вы проиграли, т.к.\nистратили все попытки");
                    field1.setBounds(45,230,400,60);
                    check.setVisible(false);
                    exit.setVisible(true);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        check.addActionListener(actionListener);
        exit.addActionListener(actionListener2);
    }
}