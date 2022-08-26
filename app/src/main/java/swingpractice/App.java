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
        System.out.println(new App().getGreeting());
        
        MainDeck deck = new MainDeck();
        deck.printContentsToConsole();
        deck.suffle();
        deck.printContentsToConsole();
        JFrame frame = new JFrame();
//        frame.setLayout(null);
        JButton button = new JButton("button text");
        JButton but2 = new JButton("Too two 4 2");
        JLabel label = new JLabel("This hasn't been set yet");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X button also exits application (app doesn't continue running with no window
        frame.setResizable(true);
        frame.setTitle("Title goes here");
        frame.setSize(800, 800);
        NonAnonClass nac = new NonAnonClass();
        button.addActionListener(nac);
        button.setBounds(5, 5, 200, 40);
        
        but2.addActionListener(e -> print2());
        but2.setBounds(300, 300, 300, 80);
        
        label.setBounds(100, 40, 200, 40);
        
        URL iconURL = App.class.getResource("/simple_icon.png");
        System.out.println(iconURL);
        
        ImageIcon icon = new ImageIcon(iconURL);
        
        frame.setIconImage(icon.getImage()); //works, but down in the "task bar" not on the window, but probably that's an OS setting on this PC I am typing from
        
        frame.add(button);
        frame.add(but2);
        frame.add(label);
//        frame.pack();
        
        frame.setVisible(true); //makes frame visible
    }
}
