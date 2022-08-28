package swingpractice;

import java.util.ArrayList;
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
    
    public void shuffle()
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
//    	May be able to do everything with the line below
//    	return this.lcs.poll();
    	LCard returnLCard = this.lcs.getFirst();
    	this.lcs.removeFirst();
    	return returnLCard;
    }
    
    public int[] findIndexesOf (String type, int value)
    {
    	int setIndex = 0;
    	int[] ar = {-1, -1, -1, -1, -1};
    	for(int i=0; i<this.lcs.size(); i++)
    	{
    		if(this.lcs.get(i).getType() == type)
    		{
    			if(this.lcs.get(i).getValue() == value)
    			{
    				ar[setIndex] = i;
    			}
    		}
    	}
    	return ar;
    }
    
}
