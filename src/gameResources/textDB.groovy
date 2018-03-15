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

	public static def artistList = [//16 artists.
		[fame:5,star:"GreenOne",promo:2,art:"Photo",color:"red",road:[0,6,9,12,15,19]],
		[fame:10,star:"GreenThree",promo:3,art:"Paint",color:"red",road:[0,0,0,12,15,19]],
		[fame:8,star:"Green���",promo:3,art:"Digital",color:"red",road:[0,0,9,12,15,19]],
		[fame:3,star:"GreenOne",promo:0,art:"Sculpture",color:"blue",road:[0,5,8,11,15,19]],
		[fame:1,star:"",promo:0,art:"Photo",color:"blue",road:[2,5,8,11,15,19]],
		[fame:1,star:"",promo:0,art:"Digital",color:"blue",road:[2,5,8,11,15,19]],
		[fame:5,star:"GreenOne",promo:1,art:"Paint",color:"blue",road:[0,6,9,12,15,19]],
		[fame:10,star:"GreenThree",promo:3,art:"Sculpture",color:"red",road:[0,0,0,12,15,19]],
	]

	public static def visitorList = [
		[rose:14,brown:14,white:12]
	]

	//Brown, Rose, BrownOrWhite, RoseOrWhite, Any
	public static def workOfArtList = [//32 works of art.
		[art:"Digital",promo:0,tickets:["Any"]],
		[art:"Digital",promo:2,tickets:["Any","Any"]],
		[art:"Digital",promo:0,tickets:["Rose"]],
		[art:"Digital",promo:1,tickets:["RoseOrWhite","Brown"]],
		[art:"Digital",promo:1,tickets:["Any","Any"]],
		[art:"Digital",promo:1,tickets:["BrownOrWhite","Rose"]],
		//
		[art:"Photo",promo:1,tickets:["BrownOrWhite","Rose"]],
		[art:"Photo",promo:2,tickets:["Any","Any"]],
		[art:"Photo",promo:0,tickets:["Rose"]],
		[art:"Photo",promo:1,tickets:["RoseOrWhite","Brown"]],
		[art:"Photo",promo:0,tickets:["Any"]],
		[art:"Photo",promo:1,tickets:["Any","Any"]],
		[art:"Photo",promo:0,tickets:["Any"]],
		[art:"Photo",promo:0,tickets:["Brown"]]
	]
}
