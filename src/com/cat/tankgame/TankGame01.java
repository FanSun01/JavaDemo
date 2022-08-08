package com.cat.tankgame;

import javax.swing.*;

public class TankGame01 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame01 t01 = new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
