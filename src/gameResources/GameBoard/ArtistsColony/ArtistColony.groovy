package gameResources.GameBoard.ArtistsColony

class ArtistColony {
	
	ArtistPlace artistPlace = new ArtistPlace();
	WorkOfArtPlace woaPlace = new WorkOfArtPlace();

	static main(args)
	{
		ArtistColony aColony = new ArtistColony();
		aColony.artistPlace.toPrint();
	}

}
