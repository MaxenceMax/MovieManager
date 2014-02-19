/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Franck
 */
public final class Panneau extends JPanel implements ActionListener {

    public Panneau() {
        this.setSize(500, 500);
        this.setBackground(Color.BLUE);
    }

    @Override
    public Component add(Component cmpnt) {
        return super.add(cmpnt);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     
    }
}
