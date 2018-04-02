package com.wint.music.com.wint.music.gui;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics gr) {
        Graphics2D g2d = (Graphics2D) gr;
        GradientPaint gradient = new GradientPaint(70, 70, getRandomColor(), 150, 150, getRandomColor());
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }
}
