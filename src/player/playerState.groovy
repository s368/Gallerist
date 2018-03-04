package player

import gameResources.ReputationTile
import gameResources.Artist.Artist
import gameResources.Assistents.FreeAssistent
import gameResources.workOfArt.WorkOfArt

class playerState {

	public Queue<FreeAssistent> assistentQueue;
	public List<WorkOfArt> artGallery;
	public List<WorkOfArt> artSold;
	
	public Artist comission;
	
	public ReputationBonus[] reputationBonus;//fixed size = 6
	public ReputationTile[] reputationTile; //fixed size = 6
	
	public ReputationTile thirdSlotReputation;
	public boolean masterpieceSlot;
	
	//public ContractSlot[] contractSlot;//fixed size = 3

	public int influence;
	public int money;
	
	public int ticketBrown;
	public int ticketRose;
	public int ticketWhite;
	
}
