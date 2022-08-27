package swingpractice;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileMenu extends JMenu 
{
//	I don't know what this means but my IDE really wanted it to be here
	private static final long serialVersionUID = 1L;
	
	FileMenu()
	{
		this.setName("File");
		JMenuItem newGame = new JMenuItem("New Game");
		
		
		this.add(newGame);
	}

}
