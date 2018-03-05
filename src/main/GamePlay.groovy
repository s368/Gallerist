package main

import gameResources.Contract.ContractCardDeck

class GamePlay {

	static main(args) {
		
		println("Hi, Word from main!");
		
		initGameBoard();
		
	}
	
	public static void initGameBoard()
	{
		
		println("Hi, Word from initGameBoard!");
		
		initIntMarketReputation();
		//initIntMarketAuction();
		
		ContractCardDeck cd = new ContractCardDeck();
		cd.initDeck();
		
		println("type = " + cd.card_02.type.toString());
		println("bonus = " + cd.card_02.bonus.toString());
		
	}
	
	public static void initIntMarketReputation()
	{
		
		
		
	}

}
