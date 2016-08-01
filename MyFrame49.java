/**
 * @(#)MyFrame49.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/26
 */
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class MyFrame49 extends JFrame implements ActionListener {
    JLabel     texto1, texto2;
    JTextField CampoNombre;
    JButton    boton;
   
    public MyFrame49() {
    	super("Repaso");
    	setBounds(200,200,300,300);
    	setVisible(true);
    	
    	Container contentpane = getContentPane();
    	contentpane.setLayout(new FlowLayout());
    	
    	boton       = new JButton("Aceptar");
    	texto1      = new JLabel("Ingrese su nombre: ");
    	texto2      = new JLabel("No se ha ingresado nombre");
    	CampoNombre = new JTextField(10);
    	CampoNombre.addActionListener(this);
    	boton.addActionListener(this);
    	
    	contentpane.add(texto1);
    	contentpane.add(CampoNombre);
    	contentpane.add(boton);
    	contentpane.add(texto2);
    	
    	pack(); //es para compactar la interfaz 
    	paintComponents(getGraphics());
    	
    	
    }//constructor
    
   public void actionPerformed (ActionEvent e)
    {
    	if(e.getSource() == CampoNombre || e.getSource() == boton) texto2.setText("su nombre es: "+CampoNombre.getText());
    	 
    }//accion en boton
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyFrame49 X = new MyFrame49();
    }//main
}//class
