package gameResources.GameBoard.ArtistsColony

import gameResources.Artist.ArtistCard
import gameResources.Artist.ArtistCardDeck
import gameResources.workOfArt.WorkOfArtDeck
import gameResources.workOfArt.ArtType
import gameResources.textDB
import gameResources.ColorType

class ArtistColonyOld {
	
	public ArtistCardDeck artistDeck = new ArtistCardDeck(textDB.artistList);
	
	public Map<ArtType,Map<ColorType,ArtistCard>> artistCardPlace = new HashMap<ArtType,HashMap<ColorType,ArtistCard>>();
	
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
	
	public ArtistColonyFirstVariant()
	{
		ArtistCard aCard = new ArtistCard();
		Map<ColorType,ArtistCard> hashInternal;
		
		int n = 0;
		while(!this.isComplete())
		{
			println("i = " + n++);
			aCard = this.artistDeck.deck.dealOne();
			
//			if(this.artistCardPlace != null &&
			if(this.artistCardPlace.get(aCard.art) == null)
			{
				hashInternal = new HashMap<ColorType,ArtistCard>();
				hashInternal.put(aCard.color, aCard)
				this.artistCardPlace.put(aCard.art, hashInternal)
			}
			else
			{
				hashInternal = this.artistCardPlace.get(aCard.art);
				hashInternal.put(aCard.color, aCard)
			}
		}
	}
	
	public CheckArtisColony()
	{
		ArtistCard aCard = new ArtistCard();
		Map<ColorType,ArtistCard> hashInternal = new HashMap<ColorType,ArtistCard>();
		
		println("deck size = " + this.artistDeck.deck.localt.size());
		
		int n = 0;
		while(!this.isComplete())
		{
			println("i = " + n++);
			aCard = this.artistDeck.deck.dealOne();
			println("aCard reference: " + aCard);
			
			if(this.isEmpty(aCard.art, aCard.color)) 
			{
				hashInternal.put(aCard.color,aCard);

				if(this.isEmpty(aCard.art, aCard.color)) 
				{
					println("ArtistColony before: art = " + aCard.art + " color = " + aCard.color + " is empty!");
				}
				else 
				{
					println("ArtistColony before: art = " + aCard.art + " color = " + aCard.color + " is NOT empty!");
				}

				this.artistCardPlace.put(aCard.art,hashInternal);

				println("ArtistColony: art = " + aCard.art + " color = " + aCard.color);
				if(this.isEmpty(aCard.art, aCard.color)) 
				{
					println("ArtistColony after: art = " + aCard.art + " color = " + aCard.color + " is empty!");
				}
				else 
				{
					println("ArtistColony after: art = " + aCard.art + " color = " + aCard.color + " is NOT empty!");
				}
			}
		}
		
//		this.artistCardPlace.put(ArtType.Photo, null)
//		this.artistCardPlace.put(ArtType.Paint, null)
//		this.artistCardPlace.put(ArtType.Sculpture, null)
//		this.artistCardPlace.put(ArtType.Digital, null)
		
//		ArtistCard aCard = new ArtistCard();
//		for(art in ArtType)
//		{
//			//ArtistCard aCard = this.artistDeck.deck.dealOne();
//			//if(aCard.art == ArtType.Paint){}
//			
//			for(color in ColorType)
//			{
//				aCard = artistCardPlace.get(art).get(color);
//				println("aCard = " + aCard);
//			}
//		}
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

	static main(args) {
		ArtistColonyOld aColony = new ArtistColonyOld();
		ArtistCard aCard = new ArtistCard();
		for(art in ArtType) {
			//ArtistCard aCard = this.artistDeck.deck.dealOne();
			//if(aCard.art == ArtType.Paint){}

			for(color in ColorType)
			{
				println("artistCardPlace = " + aColony.artistCardPlace);
				if(aColony.artistCardPlace != null && aColony.artistCardPlace.get(art) != null)
				{
					aCard = aColony.artistCardPlace.get(art).get(color);
					println("aCard = " + aCard);
				}
				else
				{
					println("aCard = " + null);
				}
			}
		}

		for(art in ArtType)
		{
			for(color in ColorType)
			{
				if(aColony.isEmpty(art, color))
				{
					println("aColony(" + art + "," + color + ") is empty!");
				}
				else
				{
					println("aColony(" + art + "," + color + ") is NOT empty!");
				}
			}//for by art
		}//for by color
		
		if(aColony.isComplete())
		{
			println("aColony is complete!");
		}
		else
		{
			println("aColony is NOT complete!");
		}
		
		ArtistColonyOld ac2 = new ArtistColonyOld();
		
		//The second version of implementation.
		ac2.initEmpty();
		ac2.fillFromDeck();
		ac2.toPrint();
		
		if(ac2.isComplete())
		{
			println("Complete!");
		}
		else
		{
			println("NOT complete!");
		}
		
	}//main
}//class
