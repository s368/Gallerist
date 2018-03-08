package gameResources

import java.util.List
import java.util.Map

class textDB {
	
	public static List<Map<String,String>> listMap = new ArrayList<List<Map<String,String>>>([
		[name:"A",age:25],
		[name:"B",age:45]
		]);

	public static def contractCardList = [
		[art:"*",bonus:"GetContract"],
		[art:"*",bonus:"GetAssistent"],
		[art:"*",bonus:"GetVisitorFromBag_Any"],
		[art:"*",bonus:"GetVisitorFromPlaza_BrownOrRose"],
		[art:"Photo",bonus:"GetMoney"],
		[art:"Paint",bonus:"GetMoney"],
		[art:"Digital",bonus:"GetInfluence"],
		[art:"Sculpture",bonus:"GetInfluence"],
	]

}
