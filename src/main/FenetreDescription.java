package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreDescription extends JFrame  {
         
           private JPanel pan = new JPanel();
           private JLabel label = new JLabel();
           private JButton bouton1 = new JButton("Start");
           public FenetreDescription(){
           pan.setLayout(new BorderLayout());
           this.setTitle("deuxième fenetre");
           this.setSize(800,600);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setLocationRelativeTo(null);
        
           pan.setBackground(Color.MAGENTA);
           label.setText("salut nous somme ds la 2 eme fenetre");
         
           pan.add(label);   
            
                            
           setContentPane(pan);
               
           this.setVisible(true);                             
        }
                
}