package com.cat.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;

    public MyPanel() {
        this.hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色
    }

}
