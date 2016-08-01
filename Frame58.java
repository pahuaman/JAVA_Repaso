/**
 * @(#)Frame58.java
 * @author Garfia José
 * @version 1.00 2016/7/28
 */

import javax.swing.JApplet;
import java.awt.*;
import javax.swing.*;


public class Frame58 extends JApplet {
      /*NO NECESITAREMOS CONSTRUCTOR
        public Frame58(){ }*/
        
        public void init()
        {
            //inicializamos el applet
        	Container contentpane = this.getContentPane();
        	contentpane.setLayout(new FlowLayout());
        	contentpane.add(new JLabel("Hola Mundo!"));
        	contentpane.add(new JButton("ClickME"));
        }//metodo init
        
        public static void main (String[] args) {
        	Frame58 X = new Frame58();
        	X.init();
       }//main
}//class