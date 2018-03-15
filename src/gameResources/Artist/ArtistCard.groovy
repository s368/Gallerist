package gameResources.Artist

import gameResources.ColorType
import gameResources.FameStars
import gameResources.workOfArt.ArtType

class ArtistCard {
	
	//closed side
	public int defaultFameIndex;
	public FameStars defaultFameStars;
	public int promo;
	
	public ArtType art;
	public ColorType color;
	
	//opened side
	public int currentFameIndex;
	public FameRoad fameRoad;
	
	public ArtistCard(ArtistCard v)
	{
		if(v != null)
		{
			this.defaultFameIndex = v.defaultFameIndex;
			this.defaultFameStars = v.defaultFameStars;
			this.promo = v.promo;
			
			this.art = v.art;
			this.color = v.color;

			this.fameRoad = v.fameRoad;
		}
	}
}
