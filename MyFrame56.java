/**
 * @(#)MyFrame56.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/28
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame56 extends JFrame implements ActionListener {
    //atributos
    JLabel    texto;    
    JMenuBar  menuubar1;
    JMenu     archivo, ayuda;
    JMenuItem abrir, guardar, salir, acerca;
    
    public MyFrame56() {
    	super("Menu");
    	setBounds(200,200,300,300);
    	setVisible(true);
    	setResizable(false);
    	
    	//la barra
    	menuubar1 = new JMenuBar();
    	
    	//menus
    	archivo   = new JMenu("Archivo");
    	ayuda     = new JMenu("Ayuda");
    	
    	//MenuItems
    	abrir     = new JMenuItem("Abrir");
    	guardar   = new JMenuItem("Guardar");
    	salir     = new JMenuItem("Salir");
    	acerca    = new JMenuItem("Acerca");
    	
    	//Comandos
    	abrir.setActionCommand("Abrir");
    	guardar.setActionCommand("Guardar");
    	salir.setActionCommand("Salir");
    	acerca.setActionCommand("Acerca");
    	
    	//agregamos orejas
        abrir.addActionListener(this);     
    	guardar.addActionListener(this);   
    	salir.addActionListener(this);    
        acerca.addActionListener(this);    
    	
    	//agregar items a cada menu
    	archivo.add(abrir);
    	archivo.add(guardar);
    	archivo.addSeparator();
    	archivo.add(salir);
    	
    	ayuda.add(acerca);
    	
    	menuubar1.add(archivo);
    	menuubar1.add(ayuda);
    	
    	this.setJMenuBar(menuubar1);//setiamos la barra a la ventana
    	
    	texto = new JLabel("Haga click en un menu");
    	
    	Container contentpane = getContentPane();
    	contentpane.setLayout(new FlowLayout());
    	contentpane.add(texto);
    	
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE); //forma de terminar el programa
    }//constructor
    
    public void actionPerformedantigua(ActionEvent e)
    {
    	if(e.getSource() == abrir)
    	{
    		texto.setText("Se ha clickeado en abrir");
    	}
    	
    	else if(e.getSource() == guardar)
    	{
    		texto.setText("Se ha clickeado en guardar");
    	}
    	
    	else if(e.getSource() == salir)
    	{
    		System.exit(0);
    	}
    	
    	else if(e.getSource() == acerca)
    	{
    		texto.setText("Se ha clickeado en acerca");
    	}
    }//eventos 
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getActionCommand() == "Abrir")
    	{
    		texto.setText("Se ha clickeado en abrir");
    	}
    	
    	else if(e.getActionCommand() == "Guardar")
    	{
    		texto.setText("Se ha clickeado en guardar");
    	}
    	
    	else if(e.getActionCommand() == "Salir")
    	{
    		System.exit(0);
    	}
    	
    	else if(e.getActionCommand() == "Acerca")
    	{
    		texto.setText("Se ha clickeado en acerca");
    	}
    }//comandos
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame56  ventana = new MyFrame56();
        
    }//main
}//class




















