package swingpractice;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class DrawButton extends JButton 
{
	private static final long serialVersionUID = 1L;
	
	public void drawCardMethod(Game g, LUI u)
	{
	g.drawCard(u);	
	}

	public void init()
	{
		
	}
	
	public DrawButton(Game g, LUI u) {
		super("Draw Card");
		this.addActionListener(e -> drawCardMethod(g, u));
	}

	public DrawButton(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public DrawButton(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public DrawButton(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

	public DrawButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	
}
