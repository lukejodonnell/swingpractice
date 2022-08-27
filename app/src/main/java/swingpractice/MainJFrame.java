package swingpractice;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainJFrame extends JFrame 
{
//    Still don't understand this
	private static final long serialVersionUID = 1L;
	
	public void init()
	{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X button also exits application (app doesn't continue running with no window
        this.setResizable(true);
        this.setSize(800, 800);
        
//        Add Custom JMenuBar
        AppJMenuBar mb = new AppJMenuBar();
        this.setJMenuBar(mb);
        
//        Add icon in corner of window
        URL iconURL = App.class.getResource("/simple_icon.png");
        System.out.println(iconURL);
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
	}

	public MainJFrame() throws HeadlessException {
		super("title goes here");
		this.init();
	}

}
