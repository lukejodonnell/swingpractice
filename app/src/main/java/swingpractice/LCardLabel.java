package swingpractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

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
	
	public void simpleGraphicInit(LCard lc)
	{
		this.setText("<html>" + lc.getValue() + "<br/>" + lc.getGold() + "</html>");
		if(lc.getType() == "gold")
		{
			this.setBackground(Color.green);
		}
		if(lc.getType() == "hazard")
		{
			this.setBackground(Color.pink);
		}
		if(lc.getType() == "artifact")
		{
			this.setBackground(Color.yellow);
		}
		this.setOpaque(true);
	}
	
	public void genTestTextInit()
	{
		this.setText("this is a card label");
	}
//	Constructors
	public LCardLabel() {
		super();
		this.setBackground(Color.blue);
		this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 20));
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
