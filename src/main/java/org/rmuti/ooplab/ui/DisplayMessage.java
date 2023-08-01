package org.rmuti.ooplab.ui;

import org.rmuti.ooplab.ui.events.VoidClick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class DisplayMessage extends JFrame {
    private String msg = "";
    private String labName = "";

    public DisplayMessage(String labName){
        super("OOP Lab");
        this.labName = labName;
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                // It haults here itself
                System.exit(0);
            }
        });
    }

    public void setOnClick(final VoidClick voidClick){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                voidClick.onClick();
                repaint();
                super.mouseClicked(e);
            }
        });
    }

    public void drawMessage(String msg){
        this.msg = msg;
        repaint();
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, 500, 500);
        g.drawString(this.labName,100, 50);
        g.drawString(this.msg, 100, 100);
    }
}
