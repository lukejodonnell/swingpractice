package swingpractice;

public class Game 
{
	Player[] player;
	
    Game(String[] ps)
    {
    	player = new Player[ps.length];
    	for(int i=0; i<ps.length; i++)
    	{
    		player[i] = new Player(ps[i]);
    	}
    }
}
