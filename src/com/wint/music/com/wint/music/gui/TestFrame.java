package com.wint.music.com.wint.music.gui;

import javax.swing.*;

public class TestFrame {

    public TestFrame() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Yes");
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
