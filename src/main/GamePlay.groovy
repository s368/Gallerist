package main

import gameResources.Contract.ContractCardDeck
import groovy.json.JsonSlurper

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
		
		println("number = " + ContractCardDeck.number);
		
		println(ContractCardDeck.personDetails.get(1).getAt("age"));
		println("value = " + ContractCardDeck.personDetails.firstName[1]);
		
		println("value listList = " + ContractCardDeck.listList.name[1]);
		
/*
		ContractCardDeck cd = new ContractCardDeck();
		cd.initDeck();
		
		println("type = " + cd.card_02.type.toString());
		println("bonus = " + cd.card_02.bonus.toString());
*/
		
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText '''
    { "simple": "stringTest",
      "fraction": 123.66,
      "exponential": 123e12
    }'''
		
		println("class = " + object.simple.class.toString());
	
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
