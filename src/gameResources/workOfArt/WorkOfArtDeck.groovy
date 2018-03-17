package gameResources.workOfArt

import utils.Deck
import gameResources.textDB

class WorkOfArtDeck {
	
	public Deck<WorkOfArt> deck = new Deck<WorkOfArt>();
	
	public WorkOfArtDeck(a = [])
	{
		WorkOfArt woa = new WorkOfArt();
		
		for(item in a)
		{
			woa.art = item.art;
			woa.promo = item.promo;
			
			woa.tickets.tickets.clear();
			for(tic in item.tickets)
			{
				woa.tickets.tickets.add(tic);
			}
			this.addCopy(woa);
		}
	}
	
	public addCopy(WorkOfArt woaOld)
	{
		WorkOfArt woaNew = new WorkOfArt(woaOld);
		this.deck.localt.add(woaNew);
	}
	
	public static main(args)
	{
		WorkOfArtDeck woaDeck = new WorkOfArtDeck(textDB.workOfArtList);
		
		int i = 1;
		for(item in woaDeck.deck.localt)
		{
			String ticString = new String();
			println(i + " before ticString =" + ticString);
			println(i + " before size =" + item.tickets.tickets.size());
			for(tic in item.tickets.tickets)
			{
				ticString += tic.toString();
			}
			println(i + " after ticString =" + ticString);
			println(i + " art = " + item.art + " promo = " + item.promo + " tickets = " + ticString);
			i++;
		}
	}
}
