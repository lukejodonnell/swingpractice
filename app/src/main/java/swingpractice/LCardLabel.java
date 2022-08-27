package swingpractice;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JLabel;

public class LCardLabel extends JLabel 
{
//    Still need to know what this means
	private static final long serialVersionUID = 1L;

	public void textInit(LCard lc)
	{
		this.setText(lc.getType() + lc.getValue() + " with " + lc.getGold());
	}
	
	public void genTestTextInit()
	{
		this.setText("this is a card label");
	}
//	Constructors
	public LCardLabel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LCardLabel(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public LCardLabel(Icon image) {
		super(image);
		// TODO Auto-generated constructor stub
	}

	public LCardLabel(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public LCardLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		// TODO Auto-generated constructor stub
	}

	public LCardLabel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	

}
