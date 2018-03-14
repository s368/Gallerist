package gameResources.GameBoard.Sales

import gameResources.Contract.ContractCard
import gameResources.Contract.ContractCardDeck
import gameResources.textDB

class ProposedContracts {
	
	public static int number = 4;
	public static List<ContractCard> proposedContracts = new ArrayList<ContractCard>();
	public static ContractCardDeck ccDeck = new ContractCardDeck(textDB.contractCardList);
	
	public ProposedContracts()
	{
/*
 		for(i in 0..<number)
		{
			println("proposedContracts = " + i);
			//proposedContracts.push(new ContractCard());
			proposedContracts.push(ccDeck.deck.dealOne());
		}
*/
		this.refillContracts();
	}
	
	public void refillContracts()
	{
		this.refillDeckIfEmpty();
		
		for(i in 0..<number)
		{
			if(proposedContracts.getAt(i) == null)
			{
				println("emty =" + i);
				proposedContracts.putAt(i,ccDeck.deck.dealOne());
			}
			else
			{
				println("already filled = " + i);
			}
		}
	}

	public void refillAllContracts()
	{
		this.refillDeckIfEmpty();
		
		for(i in 0..<number)
		{
			if(proposedContracts.getAt(i) == null)
			{
				println("emty =" + i);
				proposedContracts.putAt(i,ccDeck.deck.dealOne());
			}
			else
			{
				println("already filled = " + i);
				ccDeck.discard.localt(proposedContracts.getAt(i));
				proposedContracts.putAt(i,ccDeck.deck.dealOne());
			}
		}
	}

	public void refillDeckIfEmpty()
	{
		if(!ccDeck.deck.localt)
			{
				println("empty deck");
				ccDeck.deck.localt.addAll(ccDeck.discard.localt);
			}
			else
			{
				println("not empty deck");
			}
	}	
	
	public static void main(args)
	{
		ProposedContracts pc = new ProposedContracts();
	}
}
