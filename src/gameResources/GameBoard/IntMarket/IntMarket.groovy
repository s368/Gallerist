package gameResources.GameBoard.IntMarket

import gameResources.ReputationTile
import gameResources.workOfArt.ArtType

class IntMarket {
	
	public int columnInfluenceOne = 3;
	public int columnInfluenceTwo = 2;
	public int columnInfluenceThree = 1;
	
	public static Map<ArtType,ReputationTile> reputationColumnOne;
	public static Map<ArtType,ReputationTile> reputationColumnTwo;
	public static Map<ArtType,ReputationTile> reputationColumnThree;
	
	public static Map<String,AuctionBonusType> auctionColumnOne;
	public static Map<String,AuctionBonusType> auctionColumnTwo;
	public static Map<String,AuctionBonusType> auctionColumnThree;
	
	public static initAuctionColumnOne()
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
}
