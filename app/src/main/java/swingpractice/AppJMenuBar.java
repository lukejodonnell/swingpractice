package swingpractice;

import javax.swing.JMenuBar;

public class AppJMenuBar extends JMenuBar 
{
	private static final long serialVersionUID = 1L;
	
	public void init()
	{
        FileMenu fm = new FileMenu();
        this.add(fm);
        
        EditMenu em = new EditMenu();
        this.add(em);
	}

	AppJMenuBar()
	{
		this.init();
	}
}
