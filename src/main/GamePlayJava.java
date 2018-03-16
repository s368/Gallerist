package main;

import gameResources.textDB;
import gameResources.Contract.ContractCardDeck;
import gameResources.workOfArt.ArtType;
//import groovy.json.JsonSlurper;

class GamePlayJava {

	public static void main(String[] args) {
		
		System.out.println("Hi, Word from main!");
		
		ArtType art;
		art = ArtType.Digital;
		System.out.println("art = " + art);
		
		initGameBoard();
		
	}
	
	
	public static void initGameBoard()
	{
		
		ContractCardDeck ccDeck = new ContractCardDeck(textDB.contractCardList);

		System.out.println("Hi, Word from initGameBoard!");
		
		initIntMarketReputation();
		//initIntMarketAuction();
		
		System.out.println("number = " + ccDeck.number);
		
/*
		System.out.println(ContractCardDeck.personDetails.get(1).getAt("age"));
		System.out.println("value = " + ContractCardDeck.personDetails.firstName[1]);
		
		System.out.println("value listList = " + ContractCardDeck.listList.name[1]);
*/
		
/*
		ContractCardDeck cd = new ContractCardDeck();
		cd.initDeck();
		
		println("type = " + cd.card_02.type.toString());
		println("bonus = " + cd.card_02.bonus.toString());
*/
		
/*		
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText '''
    { "simple": "stringTest",
      "fraction": 123.66,
      "exponential": 123e12
    }'''
*/    
		
		//System.out.println("class = " + object.simple.class.toString());
	
/*		assert object instanceof Map
		assert object.simple.class == Integer
		assert object.fraction.class == BigDecimal
		assert object.exponential.class == BigDecimal
*/
		
	}
	
	public static void initIntMarketReputation()
	{
		
		
		
	}

}
