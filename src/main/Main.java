package main;

import javax.swing.JFrame;
import javax.swing.JSlider;
/**
 *
 * @author Franck
 */
public class Main {
    public static void main(String[] args) {
        //Fenetre f = new Fenetre();
        JFrame f = new JFrame();
        JSlider s = new JSlider();
        f.add(s);
        f.setVisible(true);
        System.out.println(s.getValue());
    }
    
}
