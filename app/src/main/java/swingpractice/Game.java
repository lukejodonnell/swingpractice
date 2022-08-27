package swingpractice;

public class Game 
{
	Player[] player;
	Cave cave;
	MainDeck deck;
	
	public void genPlayers(String[] ps)
	{
    	player = new Player[ps.length];
    	for(int i=0; i<ps.length; i++)
    	{
    		player[i] = new Player(ps[i]);
    	}
	}
	
	public void start()
	{
//		start the game IDK
	}
	
	
    Game(String[] ps)
    {
    	this.genPlayers(ps);
    	cave = new Cave();
    	deck = new MainDeck();
    	
    }
}
