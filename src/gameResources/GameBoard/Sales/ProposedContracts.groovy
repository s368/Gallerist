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
		for(i in 0..<number)
		{
			println("proposedContracts = " + i);
			//proposedContracts.push(new ContractCard());
			proposedContracts.push(ccDeck.deck.dealOne());
		}
	}
	
	public void refill()
	{
		for(i in 0..<number)
		{
			if(proposedContracts[i] == null)
			{
				println("emty =" + i);
				proposedContracts[i] = ccDeck.deck.dealOne();
			}		
		}
	}
	
	public static void main(args)
	{
		ProposedContracts pc = new ProposedContracts();
	}
}
