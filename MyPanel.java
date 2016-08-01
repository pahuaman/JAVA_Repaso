/**
 * @(#)MyPanel.java
 *
 *
 * @author 
 * @version 1.00 2016/7/24
 */
 import java.awt.*;
 import javax.swing.*;
 import javax.swing.JButton;


public class MyPanel extends JPanel {

    public MyPanel() {
    	setBackground(Color.red);
    	JLabel texto3 = new JLabel("texto3");
    	JButton b = new JButton("aceptar");
    	add(texto3);
    	add(b);
    	
    }
    
    
}