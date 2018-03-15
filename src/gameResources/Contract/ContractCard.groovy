package gameResources.Contract

import gameResources.workOfArt.ArtType
import utils.Deck

class ContractCard {
	
	public ArtType art;
	public ContractBonusType bonus;
	public boolean contractBonusUsed = false;
	
	public boolean closed = false;
	public ClosedContractBonus closedContractBonus;
	public boolean closedContractBonusUsed = false;
	
	public ContractCard(v)
	{
		if(v != null)
		{
			this.art = v.art;
			this.bonus = v.bonus;
		}
	}
}
