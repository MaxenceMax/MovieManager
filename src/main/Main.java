package main;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Main extends JPanel {

	public Main() {

    super(true);
    this.setLayout(new BorderLayout());
    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);

    slider.setMinorTickSpacing(2);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);

    // We'll just use the standard numeric labels for now...
    slider.setLabelTable(slider.createStandardLabels(10));

    add(slider, BorderLayout.CENTER);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Slider Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new Main());
    frame.pack();
    frame.setVisible(true);
  }
}
