package main;

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
		this.setTitle("Filmotech");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new Panneau());
		//On d��finit le layout �� utiliser sur le content pane
		this.setLayout(new BorderLayout());
		//On ajoute le bouton au content pane de la JFrame
		//Au centre
		this.getContentPane().add(new TextField("CENTER"), BorderLayout.CENTER);
		//Au nord
		this.getContentPane().add(new Label("NORTH"), BorderLayout.NORTH);
		//Au sud
		this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
		//�� l'ouest
		this.setVisible(true);      

		JPanel pan = new JPanel(); 
		BoxLayout bl = new BoxLayout(pan, BoxLayout.Y_AXIS); 
		pan.setLayout(bl);                      //attache le layoutManager au panel           
		
		
		JTextField tf = new JTextField("Futur slider"); //un champ texte!
		pan.add(tf);

		//un 2eme panel qui va etre imbriqu�� dans le 1er panel !
		JPanel pan2 = new JPanel();   //2eme panel
		bl = new BoxLayout(pan2, BoxLayout.X_AXIS);  //un autre alignement

		pan2.setLayout(bl);

		//ajoute le panel 2 dans le panel 1!
		pan.add(pan2);

		JButton but = new JButton("Description");
		pan.add(but,BorderLayout.WEST);

		setContentPane(pan);        //defini le panel de la JFrame
		setVisible(true);           //affiche la JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //op��ration par d��faut a la fermeture
	}
}
