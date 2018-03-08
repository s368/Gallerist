package gameResources.GameBoard

import gameResources.Contract.ContractCardDeck
import gameResources.textDB

class GameBoard {
	
	public int playerNumber = 1;// default = solo game.
	ContractCardDeck contractCardDeck = new ContractCardDeck(textDB.contractCardList);
	
	public GameBoard(int playerNumber = 1)
	{

	}

	static main(args) 
	{
		
		println("Hi, Word from GameBoard!");
	
		GameBoard gb = new GameBoard();
		
		println("GameBoard: " + textDB.contractCardList);
		
	}

}
