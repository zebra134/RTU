package ru.zebra134.RTU.Pr11;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MListener implements MouseListener {
    Window m;
    MListener(Window m){
        this.m = m;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        m.paint(m.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
