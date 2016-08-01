/**
 * @(#)MyFrame44.java
 *
 *
 * @author Garfia josé
 * @version 1.00 2016/7/25
 */
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

public class MyFrame44 extends JFrame implements ActionListener{
    JLabel  texto;
    JButton boton1, boton2, boton3;    
    
    public MyFrame44() {
    	setTitle("Tutorial 44");
    	setBounds(200,200,200,200);
    	setVisible(true);
    	
    	Container contentpane = getContentPane();
    	
    	contentpane.setLayout(new FlowLayout());
    	
    	Tuto44MyButton boton = new Tuto44MyButton();
    	texto  = new JLabel("haga click en algun boton");
    	boton1 = new JButton("boton #1");
    	boton2 = new JButton("boton #2");
    	boton3 = new JButton("boton #3");
    	
    	add(texto);
    	add(boton1);
    	add(boton2);
    	add(boton3);
    	boton1.addActionListener(this);
    	boton2.addActionListener(this);
    	boton3.addActionListener(this);
    
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource() == boton1){
    	 texto.setText("boton 1 elegido");
       }
       
       if(e.getSource() == boton2){
    	 texto.setText("boton 2 elegido");
       }
       
       if(e.getSource() == boton3){
    	 texto.setText("boton 3 elegido");
       }
    }//evento
    
    
    public static void main(String[] args) {
        MyFrame44 B = new MyFrame44();
    }//main
}//class
