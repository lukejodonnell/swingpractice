package swingpractice;

import java.awt.LayoutManager;

import javax.swing.JPanel;

public class CavePanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	public void addCard(LCard lc)
	{
		LCardLabel lcl = new LCardLabel();
		lcl.textInit(lc);
		this.add(lcl);
	}

	public CavePanel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CavePanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public CavePanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public CavePanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}
	
	

}
