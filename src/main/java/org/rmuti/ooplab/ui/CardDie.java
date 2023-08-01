package org.rmuti.ooplab.ui;

import org.rmuti.ooplab.ui.events.IntClick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardDie extends JFrame {
    private JButton[] buttons;
    private Die die;
    private IntClick click;

    public CardDie() {
        super("OOP Lab");
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public void setOnClick(IntClick click){
        this.click = click;
    }

    private void initComponents() {
        die = new Die();
//        buttons = new JButton[6];
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = new JButton(Integer.toString(i + 1));
//        }

        setLayout(null);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                die.changeDieFace(click.getIntOnClick());
            }
        });
//        for (int i = 0; i < buttons.length; i++) {
////            add(buttons[i]);
//            buttons[i].setBounds((60 * i) + 5, 5, 50, 25);
//        }
//        add(new JButton("clickme"));
        add(die);
    }


}
