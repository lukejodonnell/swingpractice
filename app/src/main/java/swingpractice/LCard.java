package swingpractice;

public class LCard 
{
    private int value;
    private int gold;
    private String type;
    
	public int getValue() 
	{
		return value;
	}
	
	public void setValue(int value) 
	{
		this.value = value;
	}
	
	public int getGold() 
	{
		return gold;
	}
	
	public void setGold(int gold) 
	{
		this.gold = gold;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String summary()
	{
		return this.value + " " + this.type + " card with " + this.gold + " gold on it";
	}
	
	LCard(String type, int value, int gold)
	{
		this.type = type;
		this.value = value;
		this.gold = gold;
	}
	
	LCard()
	{
		//write nothing to do nothing except do default action with this constructor
	}
    
    
}
