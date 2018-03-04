package gameResources.Contract

import gameResources.workOfArt.ArtType

class ContractCard {
	
	public ArtType type;
	public ContractBonusType bonus;
	public boolean contractBonusUsed;
	
	public boolean closed;
	public ClosedContractBonus closedContractBonus;
	public boolean closedContractBonusUsed;

}
