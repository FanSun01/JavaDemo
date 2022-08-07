package com.cat.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setVisible(true);
    }

}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics gra) {
        super.paint(gra);
        gra.drawOval(10, 10, 100, 100);
    }

}
