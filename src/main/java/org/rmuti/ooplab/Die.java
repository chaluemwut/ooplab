package org.rmuti.ooplab;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Die extends JPanel {
    private static final int WIDTH = 120;
    private static final int HEIGHT = 120;
    private int number;
    public Die() {
        this.setBounds(125, 40, WIDTH, HEIGHT);
        this.setBackground(Color.gray);
        number = 1;
    }
    public void changeDieFace(int num) {
        number = num;
        repaint();
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        switch(number) {
            case 1:
                drawDot(g, WIDTH / 2, HEIGHT / 2);
                break;
            case 2:
                drawDot(g, WIDTH / 4, HEIGHT / 4);
                drawDot(g, 3 * WIDTH / 4, 3 * HEIGHT / 4);
                break;
            case 3:
                drawDot(g, WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 2, HEIGHT / 2);
                drawDot(g, 3 * WIDTH / 4, 3 * HEIGHT / 4);
                break;
            case 4:
                drawDot(g, 3 * WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 4, HEIGHT / 4);
                drawDot(g, 3 * WIDTH / 4, 3 * HEIGHT / 4);
                drawDot(g, WIDTH / 4, 3 * HEIGHT / 4);
                break;
            case 5:
                drawDot(g, 3 * WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 2, HEIGHT / 2);
                drawDot(g, 3 * WIDTH / 4, 3 * HEIGHT / 4);
                drawDot(g, WIDTH / 4, 3 * HEIGHT / 4);
                break;
            case 6:
                drawDot(g, 3 * WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 4, HEIGHT / 4);
                drawDot(g, WIDTH / 4, HEIGHT / 2);
                drawDot(g, 3 * WIDTH / 4, HEIGHT / 2);
                drawDot(g, 3 * WIDTH / 4, 3 * HEIGHT / 4);
                drawDot(g, WIDTH / 4, 3 * HEIGHT / 4);
                break;
        }
    }
    private void drawDot(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.fillOval(x - 10, y - 10, 20, 20);
    }
}