package swingpractice;

public class Cave extends LCardStack 
{
	
    public int returnPlayers(int numOfPlayers)
    {
    	int r = 0;
		for(LCard lc : this.lcs)
		{
			if(lc.getType() == "gold")
			{
				int g = lc.getGold();
				r = r + (g / numOfPlayers);
				lc.setGold(g % numOfPlayers);
				
			}
		}
		return r;
    }
    
    public boolean caveIn()
    {
    	int[] set = {2, 2, 2, 2, 2};
    	boolean r = false;
    	for(LCard lc : this.lcs)
    	{
    		if(lc.getType() == "hazard")
    		{
    			set[lc.getValue()] = set[lc.getValue()] - 1;
    		}
    	}
    	
    	for(int i : set)
    	{
    		if(i <= 0)
    		{
    			r = true;
    		}
    	}
    	return r;
    }
    
    public void genTestCave()
    {
    	int[] ar = {1,5,5,7,11,15};
    	for(int i=0; i<ar.length; i++)
    	{
    		lcs.add(new LCard("gold", ar[i], ar[i]%4));
    	}	
    }
    
    public void genTestCave(boolean consoleDebug)
    {
    	this.genTestCave();
    	if(consoleDebug)
    	{
    		this.printContentsToConsole();
    	}
    }
}
