package gameResources.Contract

import gameResources.workOfArt.ArtType
import utils.Deck

class ContractCardDeck {
	
	public static int number = 20;
	
	public static Deck<ContractCard> deck = new Deck<ContractCard>();
	public static Deck<ContractCard> discard = new Deck<ContractCard>();
	
	public ContractCardDeck(a = [])
	{
		ContractCard cc = new ContractCard();
		//ContractCardDeck ccBufferDeck = new ContractCardDeck();
		
		println("ContractCardDeck: " + a);
		
		for(item in a)
		{
			
			if(item.art != "*")
			{
				println("ART=" + item.art + "\tBONUS=" +item.bonus)
				
				cc.art = item.art;
				cc.bonus = item.bonus;
				
				if(cc.bonus == ContractBonusType.GetInfluence)
				{
					println("cc=" + cc.bonus);
				}
				
				this.deck.localt.add(cc);
				println("deck=" + deck.get().art);
			}
			else//set of 'art'.
			{
				for(art in ArtType)
				{
					println("aaa=" + art);
					cc.art = art;
					cc.bonus = item.bonus;

					if(cc.bonus == ContractBonusType.GetInfluence)
						{
							println("cc=" + cc.bonus);
						}
						
						this.deck.localt.add(cc);
						println("deck=" + deck.get().art);
		
				}//cycle by 'art' for '*'.
			}//e.g. "Paint" vs "*".
		}//cycle by textDB list.
		
		println("number of contract cards = " + deck.localt.size());
		this.deck.shuffle();
	}//end of constructor.
}
