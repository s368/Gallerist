package gameResources.Contract

import gameResources.Visitors.Visitor
import gameResources.workOfArt.ArtType
import gameResources.textDB
import utils.Deck

class ContractCardDeck {
	
	public int number = 20;
	
	public Deck<ContractCard> deck = new Deck<ContractCard>();
	public Deck<ContractCard> discard = new Deck<ContractCard>();
	
	public ContractCardDeck(a = [])
	{
		ContractCard cc = new ContractCard();
		
		for(item in a)
		{
			
			if(item.art != "*")
			{
				cc.art = item.art;
				cc.bonus = item.bonus;
				
				this.addCopy(cc);
			}
			else//set of 'art'.
			{
				for(art in ArtType)
				{
					cc.art = art;
					cc.bonus = item.bonus;
						
					this.addCopy(cc);
				}//cycle by 'art' for '*'.
			}//e.g. "Paint" vs "*".
		}//cycle by textDB list.
		
		this.deck.shuffle();
	}//end of constructor.
	
	public addCopy(ContractCard ccOld)
	{
		ContractCard ccNew = new ContractCard(ccOld);
		this.deck.localt.add(ccNew);
	}
	
	public static main(args)
	{
		ContractCardDeck ccDeck = new ContractCardDeck(textDB.contractCardList);
		
		int i = 1;
		for(item in ccDeck.deck.localt)
		{
			println((i++) + " art = " + item.art + " bonus = " + item.bonus);
		}
	}
}
