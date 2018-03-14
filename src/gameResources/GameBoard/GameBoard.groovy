package gameResources.GameBoard

import gameResources.Contract.ContractCardDeck
import gameResources.textDB

class GameBoard {
	
	public int playerNumber = 1;// default = solo game.
	
	ContractCardDeck contractCardDeck = new ContractCardDeck(textDB.contractCardList);
	InfluenceLine infLine = new InfluenceLine();
	
	public GameBoard(int playerNumber = 1)
	{
		this.playerNumber = playerNumber;

	}

	static main(args) 
	{
		
		println("Hi, Word from GameBoard!");
	
		GameBoard gb = new GameBoard(2);
		
		println("GameBoard: " + textDB.contractCardList);
		println("gb number of players = " + gb.playerNumber);
	}

}
