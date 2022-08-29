package swingpractice;

import java.awt.BorderLayout;
import java.util.ArrayList;

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
    		System.out.println("new Player " + player[i].getName() + " generated");
    	}
	}
	
	public void splitGoldOnCard(LCard lc, Player[] pl)
	{
		int gold = lc.getValue() / pl.length;
		System.out.println("I willl give each player " + gold + " gold");
		for(Player p : pl)
		{
			p.addGold(gold);
			System.out.println("just gave " + p.getName() + " " + gold + " gold");
		}
		lc.setGold(lc.getValue() % pl.length);
		this.cave.printContentsToConsole();
	}
	
	public void returnPlayers(Player[] ps)
	{
//		will do this later
	}
	
	public void advancePlayers()
	{
		System.out.println (this.cave.getLast().summary());
		this.splitGoldOnCard(this.cave.getLast(), this.getPlayersForWhomStillGoingIs(true, this.player));
	}
	
	public Player[] getPlayersForWhomStillGoingIs(boolean b, Player[] ps)
	{
		ArrayList<Player> arp = new ArrayList<>();
		for(Player p : ps)
		{
			if(p.stillGoing() == b)
			{
				arp.add(p);
			}
		}
		System.out.println("here is the return list");
		for(Player p : ps)
		{
			System.out.println(p.getName());
		}
		return ps;
	}
	
	public void drawCard(LUI ui)
	{
		this.cave.add(this.deck.draw());
		this.advancePlayers();
		ui.update(this);
		
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
