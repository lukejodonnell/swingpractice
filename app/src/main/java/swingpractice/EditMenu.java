package swingpractice;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu extends JMenu 
{
//     Still don't know what this does but the IDE really wants it here
	private static final long serialVersionUID = 1L;
	
	public void editMethod()
	{
		System.out.println("edittinginting the editior");
	}
	public void init()
	{
		JMenuItem edit = new JMenuItem("Edit");
		edit.addActionListener(e -> editMethod());
		this.add(edit);				
	}

	public EditMenu() 
	{
		super("Edit");
		this.init();
	}
    
	
}
