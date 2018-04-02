package com.wint.music.com.wint.music.gui;

import javax.swing.*;

public class TestFrame {

    public TestFrame() {
        JFrame frame = new JFrame();
        MyDrawPanel p = new MyDrawPanel();
        frame.getContentPane().add(p);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
