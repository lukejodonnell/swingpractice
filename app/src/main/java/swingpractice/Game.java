package swingpractice;

import java.awt.BorderLayout;

public class Game 
{
	Player[] player;
	Cave cave;
	MainDeck deck;
	
	public Player[] getPlayer() 
	{
		return player;
	}

	public void setPlayer(Player[] player) 
	{
		this.player = player;
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
	
	public void start()
	{
//        MainJFrame mjf = new MainJFrame();
//        mjf.setLayout(new BorderLayout());

        
		LCard testlc = new LCard("gold", 17, 0);
        LCard testlc2 = new LCard("gold", 5, 6);
        LCard art = new LCard("artifact", 0, 0);
        
        MainDeck deck = new MainDeck();
        deck.add(art);
        deck.shuffle();

        
//        CavePanel cpl = new CavePanel();
        
        Cave c = new Cave();
		LUI ui = new LUI(this);
        
//        RoundLabel rl = new RoundLabel();
//        DrawButton drawButton = new DrawButton(this, ui);

//        mjf.add(rl, BorderLayout.NORTH);
//        mjf.add(cpl, BorderLayout.CENTER);
//        mjf.add(drawButton, BorderLayout.SOUTH);
//        
//        mjf.setVisible(true); //makes frame visible
	}
	
	
    Game(String[] ps)
    {
    	this.genPlayers(ps);
    	cave = new Cave();
    	deck = new MainDeck();
    	
    }
}
