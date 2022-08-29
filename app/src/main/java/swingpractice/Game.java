package swingpractice;

import java.awt.BorderLayout;

public class Game 
{
	Player[] player;
	Cave cave;
	MainDeck deck;
	
	public Player[] getPlayersArray() 
	{
		return player;
	}

	public void setPlayersArray(Player[] player) 
	{
		this.player = player;
	}
	
	public Player getPlayer(int i)
	{
		return this.player[i];
	}
	
	public void setPlayer(Player p, int i)
	{
		this.player[i] = p;
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) 
	{
		this.cave = cave;
	}

	public MainDeck getDeck() 
	{
		return deck;
	}

	public void setDeck(MainDeck deck) 
	{
		this.deck = deck;
	}

	public void genPlayers(String[] ps)
	{
    	player = new Player[ps.length];
    	for(int i=0; i<ps.length; i++)
    	{
    		player[i] = new Player(ps[i]);
    	}
	}
	
	public void splitGoldOnCard(LCard lc, Player[] pl)
	{
		int gold = lc.getGold() / pl.length;
		for(Player p : pl)
		{
			p.addGold(gold);
		}
		lc.setGold(lc.getGold() % pl.length);
	}
	
	public void drawCard()
	{
		
	}
	
	public void start()
	{
//		LCard testlc = new LCard("gold", 17, 0);
        LCard testlc2 = new LCard("gold", 50, 0);
        LCard art = new LCard("artifact", 0, 0);
        
        this.deck.add(art);
        this.deck.add(testlc2);
        this.deck.shuffle();
	}
	
	
    Game(String[] ps)
    {
    	this.genPlayers(ps);
    	cave = new Cave();
    	deck = new MainDeck();
    	
    }
}
