package ru.zebra134.RTU.pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    JButton btn;

    Window(){
        super("Example");
        btn = new JButton("Press the button");
        setBounds(0,0,1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(btn);
        btn.addMouseListener(new MListener(this));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        for (int i=0, q=0; i<20; i++, q=((int)(Math.random()*10))%3){
            Random random= new Random();
            graphics2D.setColor(new Color (Math.abs(random.nextInt())));
            drawShape(new Circle( Math.random()*100, Math.abs(random.nextInt())%100+50, Math.abs(random.nextInt())%100+50), graphics2D);
        }
    }
    private void drawShape(Shape a, Graphics2D graphics2D){
        a.draw(graphics2D);
    }
}