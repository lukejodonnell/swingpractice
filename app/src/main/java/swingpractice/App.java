/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package swingpractice;

import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class App 
{
    public String getGreeting() 
    {
        return "Hello World!";
    }
    
    public static void print2()
    {
    	System.out.println("wurd 2 ya mama");
    }

    public static void main(String[] args) 
    {
//    	boolean consoleDebug = false;
        System.out.println(new App().getGreeting());
        MainJFrame mjf = new MainJFrame();
        
        mjf.setVisible(true); //makes frame visible
    }
}
