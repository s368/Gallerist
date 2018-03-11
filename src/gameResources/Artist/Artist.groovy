package gameResources.Artist

import gameResources.ColorType
import gameResources.FameStars
import gameResources.workOfArt.ArtType

class Artist {
	
	//closed side
	public int defaultFameIndex;
	public FameStars defaultFameStars;
	public int promo;
	
	public ArtType art;
	public ColorType color;
	
	//opened side
	public int currentFameIndex;
	public FameRoad fameRoad;
}
