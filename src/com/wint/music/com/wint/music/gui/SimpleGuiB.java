package com.wint.music.com.wint.music.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiB implements ActionListener {
    JButton button;

    public SimpleGuiB() {
        JFrame frame = new JFrame();
        button = new JButton("Not clicked.");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText(button.getText() + " Clicked.");
    }
}
