package gameResources.GameBoard.ArtistsColony

import gameResources.Artist.ArtistCard
import gameResources.Artist.ArtistCardDeck
import gameResources.workOfArt.WorkOfArtDeck
import gameResources.textDB

class ArtistColony {
	
	public ArtistCardDeck artistDeck = new ArtistCardDeck(textDB.artistList);
	public WorkOfArtDeck woaDeck = new WorkOfArtDeck(textDB.workOfArtList);
	
	public ArtistCard photoBlueArtist;
	public ArtistCard photoRedArtist;

	public ArtistCard sculptureBlueArtist;
	public ArtistCard sculptureRedArtist;

	public ArtistCard paintBlueArtist;
	public ArtistCard paintRedArtist;

	public ArtistCard digitalBlueArtist;
	public ArtistCard digitalRedArtist;
	
	public ArtisColony
	{
		
	}
	
	static main(args) {
	}
}
