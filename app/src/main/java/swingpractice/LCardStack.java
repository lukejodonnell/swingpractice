package swingpractice;

import java.util.Collections;
import java.util.LinkedList;

public class LCardStack 
{
    protected LinkedList<LCard> lcs = new LinkedList<>();
    
    public void add(LCard lc)
    {
    	this.lcs.add(lc);
    }
	
    public LCard get(int i)
    {
    	return lcs.get(i);
    }
    
    public void suffle()
    {
    	Collections.shuffle(lcs);
    }
    
    public void printContentsToConsole()
    {
    	for(LCard c : lcs)
    	{
    		System.out.println(c.summary());
    	}
    }
    
    public LCard draw() 
    {
    	LCard returnLCard = this.lcs.getFirst();
    	this.lcs.removeFirst();
    	return returnLCard;
    }
    
}
