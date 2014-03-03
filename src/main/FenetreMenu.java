package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMenu extends JFrame implements ActionListener {
       
		private FenetreDescription fen;   
       	private JPanel pan = new JPanel();
       	private JButton bouton1 = new JButton("Start");
        private JSlider s = new JSlider();
        
       	public FenetreMenu(){

           this.setTitle("Première fenêtre");
           this.setSize(800, 600);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setLocationRelativeTo(null);
           setLayout(new BorderLayout());
           pan.add(s, BorderLayout.NORTH);
           pan.add(bouton1, BorderLayout.SOUTH);
//           pan.add(s);
//           pan.add(bouton1);    
           bouton1.addActionListener(this);
           setContentPane(pan);          
           this.setVisible(true);                             
        }
       	
       	
       public void actionPerformed(ActionEvent arg0) {
           //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenêtre
            this.dispose();
            fen = new FenetreDescription();          
   }  
       
       public static void main(String[] args) {          
    	   FenetreMenu fen= new FenetreMenu();
   }
 
}