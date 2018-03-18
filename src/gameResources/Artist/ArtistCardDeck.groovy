package gameResources.Artist

import gameResources.workOfArt.WorkOfArt
import gameResources.textDB
import utils.Deck

class ArtistCardDeck {

	public Deck<ArtistCard> deck = new Deck<ArtistCard>();
	
	public ArtistCardDeck(a = [])
	{
		ArtistCard aCard = new ArtistCard();
		
		for(item in a)
		{
			aCard.defaultFameIndex = item.fame;
			aCard.defaultFameStars = item.star;
			aCard.promo = item.promo;
			
			aCard.art = item.art;
			aCard.color = item.color;

			aCard.fameRoad.greenOne = item.road[0];
			aCard.fameRoad.greenTwo = item.road[1];
			aCard.fameRoad.greenThree = item.road[2];
			aCard.fameRoad.goldOne = item.road[3];
			aCard.fameRoad.goldTwo = item.road[4];
			aCard.fameRoad.brilliant = item.road[5];

			this.addCopy(aCard);
		}
	}
	
	public addCopy(ArtistCard aOld)
	{
		ArtistCard aNew = new ArtistCard(aOld);
		this.deck.localt.add(aNew);
	}
	
	public static main(args) 
	{
		ArtistCardDeck<ArtistCard> acDeck = new ArtistCardDeck<ArtistCard>(textDB.artistList);
		
		int i = 1;
		for(item in acDeck.deck.localt)
		{
			println(i + " art =" + item.art);
			println(i + " color =" + item.color);
			println(i + " greenOne =" + item.fameRoad.greenOne);
			i++;
		}
	}
}
