/**
 * @(#)MundoInter.java
 *
 *
 * @author 
 * @version 1.00 2016/7/24
 */
 
 import java.awt.Container;
 import javax.swing.*;
 
 class MyFrame37 extends JFrame
 {
 	//constrcutor
 	MyFrame37()
 	{
 		setTitle("Ventana");
 		setBounds(300,100,300,300); //es para el tamaño
 		
 	    Container contentpane = getContentPane();
 		
 		JLabel Texto1 = new JLabel("Hola Mundo! ");
 		
 		contentpane.add(Texto1);
 		
 	}//constructor
 	
 	
 }//class

public class MundoInter {
        
    
    public MundoInter() {
    }
    
    
    public static void main(String[] args) {
        MyFrame37 Ventana1 = new MyFrame37();
        Ventana1.setVisible(true);
        
    }//main
}//class mundoInter
