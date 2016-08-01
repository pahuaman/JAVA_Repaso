/**
 * @(#)MyFrame39.java
 *
 *
 * @author 
 * @version 1.00 2016/7/24
 */
 import java.awt.FlowLayout;
 import java.awt.Container;
 import javax.swing.*;

public class MyFrame39 extends JFrame {
        
    
    public MyFrame39() {
    	
    	setTitle("Repaso 39");
    	setBounds(0,0,400,400);
    	setVisible(true);
    	
    	Container Contentpane = getContentPane();
    	
    	//FlowLayout layout1 = new FlowLayout();
    	
    	Contentpane.setLayout(new FlowLayout());
    	JLabel texto1 = new JLabel("texto1");
    	JLabel texto2 = new JLabel("texto2");
    	JButton Boton1 = new JButton("aceptar");
    	
    	Contentpane.add(texto1);
    	Contentpane.add(texto2);
    	Contentpane.add(Boton1);
    	
    }//constructor
    
    
    public static void main(String[] args) {
        MyFrame39 M = new MyFrame39();
    }//main
}//class myframe39
