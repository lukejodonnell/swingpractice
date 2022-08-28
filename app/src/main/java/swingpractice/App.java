/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package swingpractice;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

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
    
    public static void drawCardMethod()
    {
    	
    }

    public static void main(String[] args) 
    {
//    	boolean consoleDebug = false;
        System.out.println(new App().getGreeting());
        MainJFrame mjf = new MainJFrame();
        mjf.setLayout(new BorderLayout());
        LCard testlc = new LCard("gold", 17, 0);
        LCard testlc2 = new LCard("gold", 5, 6);
        
        MainDeck deck = new MainDeck();
        deck.shuffle();

        
        CavePanel cpl = new CavePanel();
//        cpl.addCard(testlc);
//        cpl.addCard(testlc2);
        
        DrawButton drawButton = new DrawButton(deck, cpl);

        mjf.add(cpl, BorderLayout.NORTH);
        mjf.add(drawButton, BorderLayout.CENTER);
        
        mjf.setVisible(true); //makes frame visible
    }
}
