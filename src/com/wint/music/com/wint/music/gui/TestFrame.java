package com.wint.music.com.wint.music.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame implements ActionListener {
    private JFrame frame;

    public TestFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change color");
        button.addActionListener(this);

        MyDrawPanel p = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, p);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
