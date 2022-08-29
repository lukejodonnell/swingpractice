package swingpractice;

public class Player 
{
    private String name;
    private int gold;
    private boolean stillGoing;
    
    public boolean stillIn()
    {
    	return stillGoing;
    }
    
    public void returned()
    {
    	stillGoing = false;
    }
    
    public void newRound()
    {
    	stillGoing = true;
    }

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getGold() 
	{
		return gold;
	}
	
	public void setGold(int gold) 
	{
		this.gold = gold;
	}
	
	public void addGold(int g)
	{
		this.gold = this.gold + g;
	}
	
	Player(String name)
	{
		this.name = name;
		this.gold = 0;
		stillGoing = true;
	}
}
