package com.wint.music.com.wint.music.gui;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}
