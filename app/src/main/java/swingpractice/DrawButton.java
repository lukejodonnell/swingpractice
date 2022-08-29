package swingpractice;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class DrawButton extends JButton 
{
	private static final long serialVersionUID = 1L;
	
	public void drawCardMethod(MainDeck deck, Cave c, CavePanel cpl, RoundLabel rl)
	{
		c.add(deck.draw());
		cpl.update(c);
		if(c.caveIn())
		{
			rl.setText("YOU LOST HAHAHAHAH");
		}
	}

	public void init()
	{
		
	}
	
	public DrawButton(MainDeck deck, Cave c, CavePanel cpl, RoundLabel rl) {
		super("Draw Card");
		this.addActionListener(e -> drawCardMethod(deck, c, cpl, rl));
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
