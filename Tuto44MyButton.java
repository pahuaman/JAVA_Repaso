/**
 * @(#)Tuto44MyButton.java
 *
 *
 * @author 
 * @version 1.00 2016/7/25
 */
 
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

public class Tuto44MyButton extends JButton implements ActionListener {

    public Tuto44MyButton() {
    	super("Click me!");
    }
    
  public void actionPerformed(ActionEvent e)
  {
  	System.out.println ("Se ha clickeado en el button");
  }//metodo que hay que implementar a fuerza
}