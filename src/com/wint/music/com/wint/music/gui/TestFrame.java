package com.wint.music.com.wint.music.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame implements ActionListener {
    private JFrame frame;
    private JLabel label;

    public TestFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButt = new JButton("Change label");
        labelButt.addActionListener(new LabelListener());

        JButton colorButt = new JButton("Change color");
        colorButt.addActionListener(new ColorListener());

        label = new JLabel("Label");
        MyDrawPanel p = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, p);
        frame.getContentPane().add(BorderLayout.EAST, labelButt);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButt);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    private class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(label.getText() + "\nd'oh!");
        }
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
