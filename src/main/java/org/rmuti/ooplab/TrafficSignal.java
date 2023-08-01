package org.rmuti.ooplab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TrafficSignal extends JFrame {

    // Setting the buttons for the layout
//    JRadioButton jr1;
//    JRadioButton jr2;
//    JRadioButton jr3;
//
//    // Setting the field area
//    JTextField j1 = new JTextField(10);
//    ButtonGroup b = new ButtonGroup();
//    String msg = " ";
//
//    // Initially setting the co-ordinates to 0,0,0
//    int x = 0, y = 0, z = 0;
//
    int flag=0;
//    JFrame jf;

    public TrafficSignal(int i)
    {
        super("OOP Lab");
        setLayout(new FlowLayout());
        flag = i;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                // It haults here itself
                System.exit(0);
            }
        });
    }

    // Method 2
    // To change colors of traffic signal
//    public void itemStateChanged(ItemEvent ie)
//    {
//        // If it is red
//        if (ie.getSource() == jr1) {
//            if (ie.getStateChange() == 1) {
//
//                // Then display message- Stop
//                msg = "Stop!";
//                x = 1;
//
//                // Repainting the box with original one
//                // Practically black
//                repaint();
//            }
//            else {
//                msg = "";
//            }
//        }
//
//        // If state is Orange or technically jr2
//        if (ie.getSource() == jr2) {
//            if (ie.getStateChange() == 1) {
//
//                // Then display message-
//                // Get ready in waiting state
//                msg = "Get Ready to go!";
//                y = 1;
//
//                // Again repainting the button
//                repaint();
//            }
//            else {
//                msg = "";
//            }
//        }
//
//        // If state is Green
//        if (ie.getSource() == jr3) {
//            if (ie.getStateChange() == 1) {
//
//                // Then display message- Go
//                msg = "Go!!";
//                z = 1;
//                repaint();
//            }
//            else {
//                msg = "";
//            }
//        }
//        j1.setText(msg);
//    }

    public void draw(int i){
        System.out.println("out "+i);
        flag = i;
        draw();
        repaint();
    }

    public void draw(){
        // Setting size and making traffic signal
        // operational using setVisible() method
//        JFrame jf = new TrafficSignal(flag);
//        jf.setSize(500, 500);
//        jf.setVisible(true);
//        System.out.println("draw");
        setSize(500, 500);
        setVisible(true);
    }

    // Method 3
    // handling the paint graphics and
    // dimensions of the buttons via
    // setting co-ordinates
    public void paint(Graphics g)
    {
        g.drawRect(100, 105, 110, 270);
        g.drawOval(120, 150, 60, 60);
        g.drawOval(120, 230, 60, 60);
        g.drawOval(120, 300, 60, 60);

        // Case: Red
        if (flag == 1) {
            g.setColor(Color.RED);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
        } else if(flag == 2){
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
        } else {
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(120, 300, 60, 60);
        }
    }

}
