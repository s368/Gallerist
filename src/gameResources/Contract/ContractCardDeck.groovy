package gameResources.Contract

import gameResources.workOfArt.ArtType

class ContractCardDeck {
	
	public int number = 20;
	
	public static List<ContractCard> deck;
	public static List<ContractCard> discard;

	public static ContractCard card_01;
	public static ContractCard card_02;
	public static ContractCard card_03;
	public static ContractCard card_04;
	public static ContractCard card_05;
	public static ContractCard card_06;
	public static ContractCard card_07;
	public static ContractCard card_08;
	public static ContractCard card_09;
	public static ContractCard card_10;
	public static ContractCard card_11;
	public static ContractCard card_12;
	public static ContractCard card_13;
	public static ContractCard card_14;
	public static ContractCard card_15;
	public static ContractCard card_16;
	public static ContractCard card_17;
	public static ContractCard card_18;
	public static ContractCard card_19;
	public static ContractCard card_20;
	
	public void initDeck()
	{
		//4 - contract
		//4 - assistent
		//4 - visitor from bag
		//4 - visitor from plaza
		//2 - money (Photo,Paint)
		//2 - influence (Digital,Sculpture)
		
		card_01.type = ArtType.Paint;
		card_01.bonus = ContractBonusType.GetVisitorFromBag_Any;
		
		card_02.type = ArtType.Sculpture;
		card_02.bonus = ContractBonusType.GetVisitorFromBag_Any;
		
		card_03.type = ArtType.Photo;
		card_03.bonus = ContractBonusType.GetContract;
		
		card_04.type = ArtType.Paint;
		card_04.bonus = ContractBonusType.GetMoney;
		
		card_05.type = ArtType.Photo;
		card_05.bonus = ContractBonusType.GetMoney;
		
		card_06.type = ArtType.Digital;
		card_06.bonus = ContractBonusType.GetInfluence;
		
		card_07.type = ArtType.Paint;
		card_07.bonus = ContractBonusType.GetVisitorFromBag_Any;
		
		card_08.type = ArtType.Paint;
		card_08.bonus = ContractBonusType.GetVisitorFromPlaza_BrownOrRose;
		
		card_09.type = ArtType.Sculpture;
		card_09.bonus = ContractBonusType.GetVisitorFromPlaza_BrownOrRose;
		
		card_10.type = ArtType.Photo;
		card_10.bonus = ContractBonusType.GetVisitorFromPlaza_BrownOrRose;
		
		card_11.type = ArtType.Photo;
		card_11.bonus = ContractBonusType.GetVisitorFromBag_Any;
		
		card_12.type = ArtType.Paint;
		card_12.bonus = ContractBonusType.GetContract;
		
		card_13.type = ArtType.Paint;
		card_13.bonus = ContractBonusType.GetAssistent;
		
		card_14.type = ArtType.Digital;
		card_14.bonus = ContractBonusType.GetVisitorFromPlaza_BrownOrRose;
		
		card_15.type = ArtType.Digital;
		card_15.bonus = ContractBonusType.GetContract;
		
		card_16.type = ArtType.Sculpture;
		card_16.bonus = ContractBonusType.GetInfluence;
		
		card_17.type = ArtType.Digital;
		card_17.bonus = ContractBonusType.GetVisitorFromBag_Any;
		
		card_18.type = ArtType.Photo;
		card_18.bonus = ContractBonusType.GetContract;
		
		card_19.type = ArtType.Digital;
		card_19.bonus = ContractBonusType.GetAssistent;
		
		card_20.type = ArtType.Sculpture;
		card_20.bonus = ContractBonusType.GetAssistent;

	}
}
