package swingpractice;

import java.awt.BorderLayout;

public class LUI 
{
	MainJFrame mjf;
    CavePanel cpl;
    RoundLabel rl;
    DrawButton db;
    
    
//
//    mjf.add(rl, BorderLayout.NORTH);
//    mjf.add(cpl, BorderLayout.CENTER);
//    mjf.add(drawButton, BorderLayout.SOUTH);
    


    public MainJFrame getMjf() 
    {
		return mjf;
	}


	public void setMjf(MainJFrame mjf) 
	{
		this.mjf = mjf;
	}


	public CavePanel getCpl() 
	{
		return cpl;
	}


	public void setCpl(CavePanel cpl) 
	{
		this.cpl = cpl;
	}


	public RoundLabel getRl() 
	{
		return rl;
	}


	public void setRl(RoundLabel rl) 
	{
		this.rl = rl;
	}


	public DrawButton getDb() 
	{
		return db;
	}


	public void setDb(DrawButton db) 
	{
		this.db = db;
	}


	LUI(Game g)
    {
    	mjf= new MainJFrame();
    	cpl = new CavePanel();
    	rl = new RoundLabel();
    	db = new DrawButton(g, this);
    	mjf.setLayout(new BorderLayout());
    	
    	mjf.add(rl, BorderLayout.NORTH);
    	mjf.add(cpl, BorderLayout.CENTER);
    	mjf.add(db, BorderLayout.SOUTH);
    	
    	mjf.setVisible(true); //makes frame visible
    }
}
