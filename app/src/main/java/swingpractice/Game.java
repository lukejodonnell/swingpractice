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
		LCard testlc = new LCard("gold", 17, 0);
        LCard testlc2 = new LCard("gold", 5, 6);
        LCard art = new LCard("artifact", 0, 0);
        
        MainDeck deck = new MainDeck();
        deck.add(art);
        deck.shuffle();

        
        CavePanel cpl = new CavePanel();
	}
	
	
    Game(String[] ps)
    {
    	this.genPlayers(ps);
    	cave = new Cave();
    	deck = new MainDeck();
    	
    }
}
