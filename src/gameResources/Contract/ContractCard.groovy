package gameResources.Contract

import gameResources.workOfArt.ArtType

class ContractCard {
	
	public ArtType type;
	public ContractBonusType bonus;
	public boolean contractBonusUsed = false;
	
	public boolean closed = false;
	public ClosedContractBonus closedContractBonus;
	public boolean closedContractBonusUsed = false;

}
