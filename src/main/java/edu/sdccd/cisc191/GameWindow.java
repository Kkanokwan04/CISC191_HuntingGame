package edu.sdccd.cisc191;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.add(new GamePanel());  // Your game JPanel
        this.setVisible(true);
    }
}

