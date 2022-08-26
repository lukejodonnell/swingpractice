package swingpractice;

public class MainDeck extends LCardStack 
{
	public void genGoldCards(boolean consoleDebug)
	{
		int[] array = {1,2,3,4,5,5,7,7,9,11,11,13,14,15,17};
		for(int i=0; i<array.length; i++)
		{
			this.lcs.add(new LCard("gold", array[i], 0));
			if(consoleDebug)
			{
			    System.out.println("added a new " + this.lcs.get(i).summary());
			}
		}
	}
	
	public void genHazardCards(boolean consoleDebug)
	{
		for(int i=0; i<5; i++)
		{
			for(int c=0; c<3; c++)
			{
				this.lcs.add(new LCard("hazard", i, 0));
				if(consoleDebug)
				{
				    System.out.println("added a new hazard of type" + i);
				}
			}
		}
	}
	
    MainDeck(boolean consoleDebug)
    {
    	this.genGoldCards(consoleDebug);
    	this.genHazardCards(consoleDebug);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
