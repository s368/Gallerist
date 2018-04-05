package gameResources.GameBoard.ArtistsColony

import java.util.Map

import gameResources.ColorType
import gameResources.Artist.ArtistCard
import gameResources.Artist.ArtistCardDeck
import gameResources.workOfArt.ArtType
import gameResources.textDB

class ArtistPlace {

	public ArtistCardDeck artistDeck = new ArtistCardDeck(textDB.artistList);
	
	public Map<ArtType,Map<ColorType,ArtistCard>> artistCardPlace = new HashMap<ArtType,HashMap<ColorType,ArtistCard>>();
	
	public ArtistPlace()
	{
		this.initEmpty();
		this.fillFromDeck();
	}
	
	public initEmpty()
	{
		for(art in ArtType)
			{
				Map<ColorType,ArtistCard> hashInternal = new HashMap<ColorType,ArtistCard>();
				
				for(color in ColorType)
				{
					hashInternal.put(color, null);
					this.artistCardPlace.put(art, hashInternal);
				}//for by color - internal hash.
			}//for by art - external hash.
	}

	public fillFromDeck()
	{
		ArtistCard aCard = new ArtistCard();
		Map<ColorType,ArtistCard> hashInternal;
		
		int n = 0;
		while(!this.isComplete())
		{
			println("i = " + n++);
			aCard = this.artistDeck.deck.dealOne();

			hashInternal = this.artistCardPlace.get(aCard.art);
			hashInternal.put(aCard.color, aCard)
		}
	}

	public boolean isEmpty(ArtType art, ColorType color)
	{
		if(this.artistCardPlace != null &&
		this.artistCardPlace.get(art) != null &&
		this.artistCardPlace.get(art).get(color) != null) 
		{
			return false;
		}
		
		return true;
	}

	public boolean isComplete()
	{
		for(art in ArtType)
		{
			for(color in ColorType)
			{
				if(this.isEmpty(art, color))
				{
					return false;
				}
			}//for by color.
		}//for by art.
		
		return true;
	}

	public boolean toPrint()
	{
		for(art in ArtType)
		{
			for(color in ColorType)
			{
				println("art = " + art + " color = " + color + " ArtistCard = " + this.artistCardPlace.get(art).get(color));
			}//for by color.
		}//for by art.
		
		return true;
	}

	static main(args)
	{
		ArtistPlace ap = new ArtistPlace();
		ap.toPrint();
		
		if(ap.isComplete())
		{
			println("Complete!");
		}
		else
		{
			println("NOT complete!");
		}
		
	}//main

}
