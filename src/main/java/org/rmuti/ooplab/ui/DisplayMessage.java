package org.rmuti.ooplab.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

    public void drawMessage(String msg){
        this.msg = msg;
    }

    public void paint(Graphics g) {
        g.drawString(this.labName,100, 50);
        g.drawString(this.msg, 100, 100);
    }
}
