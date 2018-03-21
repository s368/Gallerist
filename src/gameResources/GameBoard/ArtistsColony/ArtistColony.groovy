package gameResources.GameBoard.ArtistsColony

import gameResources.Artist.ArtistCard
import gameResources.Artist.ArtistCardDeck
import gameResources.workOfArt.WorkOfArtDeck
import gameResources.workOfArt.ArtType
import gameResources.textDB
import gameResources.ColorType

class ArtistColony {
	
	public ArtistCardDeck artistDeck = new ArtistCardDeck(textDB.artistList);
	public WorkOfArtDeck woaDeck = new WorkOfArtDeck(textDB.workOfArtList);
	
	public ArtistCard photoBlueArtist = new ArtistCard();
	public ArtistCard photoRedArtist;

	public ArtistCard sculptureBlueArtist;
	public ArtistCard sculptureRedArtist;

	public ArtistCard paintBlueArtist;
	public ArtistCard paintRedArtist;

	public ArtistCard digitalBlueArtist;
	public ArtistCard digitalRedArtist;
	
	public Map<ArtType,Map<ColorType,ArtistCard>> artistCardPlace = new HashMap<ArtType,HashMap<ColorType,ArtistCard>>();
	
	public ArtisColony
	{
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
	
	static main(args) 
	{
		ArtistColony aColony = new ArtistColony();
		ArtistCard aCard = new ArtistCard();
		for(art in ArtType)
		{
			//ArtistCard aCard = this.artistDeck.deck.dealOne();
			//if(aCard.art == ArtType.Paint){}
			
			for(color in ColorType)
			{
				println("artistCardPlace = " + aColony.artistCardPlace);
				if(aColony.artistCardPlace != null)
				{
					aCard = aColony.artistCardPlace.get(art);
					println("aCard = " + aCard);
				}
				else
				{
					println("aCard = " + null);
				}
			}
		}
	}
}
