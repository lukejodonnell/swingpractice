package swingpractice;

public class Player 
{
    private String name;
    private int gold;
    
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
	
	Player(String name)
	{
		this.name = name;
		this.gold = 0;
	}
}
