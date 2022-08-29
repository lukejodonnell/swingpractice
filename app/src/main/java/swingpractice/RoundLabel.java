package swingpractice;

import java.awt.Font;

import javax.swing.JLabel;

public class RoundLabel extends JLabel 
{
	private static final long serialVersionUID = 1L;

	int round;
	
	public void setText(int i)
	{
		this.setText("Round " + i);
		this.revalidate();
	}
	
	public void advanceRound()
	{
		round = round + 1;
		this.setText(round);
	}
	
	RoundLabel()
	{
		super();
		round = 1;
		this.setFont(new Font(this.getFont().getName(), this.getFont().getStyle(), 22));
		this.setText(round);
	}
}
