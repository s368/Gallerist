package gameResources.GameBoard.IntMarket

import gameResources.ReputationTile
import gameResources.workOfArt.ArtType

class IntMarket {
	
	public int columnInfluenceOne = 3;
	public int columnInfluenceTwo = 2;
	public int columnInfluenceThree = 1;
	
	public Map<ArtType,ReputationTile> reputationColumnOne = new HashMap<ArtType,ReputationTile>();
	public Map<ArtType,ReputationTile> reputationColumnTwo;
	public Map<ArtType,ReputationTile> reputationColumnThree;
	
	public Map<String,AuctionBonusType> auctionColumnOne = new HashMap<String,AuctionBonusType>();
	public Map<String,AuctionBonusType> auctionColumnTwo = new HashMap<String,AuctionBonusType>();
	public Map<String,AuctionBonusType> auctionColumnThree = new HashMap<String,AuctionBonusType>();
	
	public IntMarket()
	{
		auctionColumnOne.put("1",AuctionBonusType.GetTicketOne);
		auctionColumnOne.put("3",AuctionBonusType.GetAssistent);
		auctionColumnOne.put("6",AuctionBonusType.GetVisitor);
		
		auctionColumnTwo.put("1",AuctionBonusType.GetAssistent);
		auctionColumnTwo.put("3",AuctionBonusType.GetInfluence);
		auctionColumnTwo.put("6",AuctionBonusType.GetMoney);

		auctionColumnThree.put("1",AuctionBonusType.GetTicketTwo);
		auctionColumnThree.put("3",AuctionBonusType.GetMoney);
		auctionColumnThree.put("6",AuctionBonusType.GetInfluence);

	}
	
	static main(args)
	{
		IntMarket im = new IntMarket();
		for(item in im.auctionColumnOne)
		{
			println("key = " + item.key);
			println("value = " + item.value);
		}
	}
}
