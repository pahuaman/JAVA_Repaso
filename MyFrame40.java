/**
 * @(#)MyFrame40.java
 *
 *
 * @author 
 * @version 1.00 2016/7/24
 */
 import java.awt.*;
 import javax.swing.*;
 import javax.swing.JButton;

public class MyFrame40 extends JFrame {
        
    
    public MyFrame40() {
    	
    	setTitle("Repaso 40");
    	setBounds(0,0,400,400);
    	setVisible(true);
    	
    	Container Contentpane = getContentPane();
    	//Contentpane.setLayout(new FlowLayout());
    	
    	//agregamos nuevos elementos para este repaso
    	
    	MyPanel panel1 = new MyPanel();
    	
    	Contentpane.add(panel1);
    	
    }//constructor
    
    
    public static void main(String[] args) {
       MyFrame40 Z = new MyFrame40();
       
    }//main
}//class
