/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.*;

/**
 *
 * @author Franck
 */
public class Fenetre extends JFrame {

    public Fenetre() {
    this.setTitle("Bouton");
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(new Panneau());
    //On définit le layout à utiliser sur le content pane
    this.setLayout(new BorderLayout());
    //On ajoute le bouton au content pane de la JFrame
    //Au centre
    this.getContentPane().add(new TextField("CENTER"), BorderLayout.CENTER);
    //Au nord
    this.getContentPane().add(new Label("NORTH"), BorderLayout.NORTH);
    //Au sud
    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
    //À l'ouest
    this.setVisible(true);
  }      
        
        
//        super("Filmotech");      
//        setSize(new Dimension(600, 600));        //la taille       
//        JPanel pan = new JPanel(); 
//        BoxLayout bl = new BoxLayout(pan, BoxLayout.Y_AXIS); 
//        pan.setLayout(bl);                      //attache le layoutManager au panel           
//       
//        JLabel lab = new JLabel("Filmotech");  //créé un label
//        pan.add(lab);           //l'ajoute au panel       
//        JTextField tf = new JTextField("Futur slider"); //un champ texte!
//        pan.add(tf);
//
//        //un 2eme panel qui va etre imbriqué dans le 1er panel !
//        JPanel pan2 = new JPanel();   //2eme panel
//        bl = new BoxLayout(pan2, BoxLayout.X_AXIS);  //un autre alignement
//        
//        pan2.setLayout(bl);
//
//        //ajoute le panel 2 dans le panel 1!
//        pan.add(pan2);
//
//        JButton but = new JButton("En savoir plus");
//        pan.add(but,BorderLayout.EAST);
//
//        setContentPane(pan);        //defini le panel de la JFrame
//        setVisible(true);           //affiche la JFrame
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opération par défaut a la fermeture
    }
