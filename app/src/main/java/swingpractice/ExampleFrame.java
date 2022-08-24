package swingpractice;

import java.awt.Color;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ExampleFrame extends JFrame
{
	static URL defaultIconURL = App.class.getResource("/simple_icon.png");
	
    public ExampleFrame(URL iconURL)
    {
        System.out.println(new App().getGreeting());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X button also exits application (app doesn't continue running with no window
        this.setResizable(true);
        this.setTitle("Title goes here");
        this.setSize(420, 420);
        
        System.out.println(iconURL);
        
        ImageIcon icon = new ImageIcon(iconURL);
        
        this.setIconImage(icon.getImage()); //works, but down in the "task bar" not on the window, but probably that's an OS setting on this PC I am typing from
        
        this.getContentPane().setBackground(new Color(255,200,0));

        this.setVisible(true); //makes this visible
    }
    
    public ExampleFrame()
    {
        this(defaultIconURL);
    }
}
