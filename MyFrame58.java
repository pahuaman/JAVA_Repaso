/**
 * @(#)MyFrame58.java
 *
 *
 * @author 
 * @version 1.00 2016/7/28
 */

import javax.swing.JApplet;
import java.awt.*;
import java.awt.Container;
import javax.swing.*;
import java.applet.*;

public class MyFrame58 extends JApplet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        //inicializamos el applet
        	Container contentpane = this.getContenpane();
        	contentpane.setLayout(new FlowLayout());
        	contentpane.add(new JLabel("Hola Mundo!"));
        	contentpane.add(new JButton("ClickME"));
    }

    public void paint(Graphics g) {
        
    }
}