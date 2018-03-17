package gameResources.workOfArt

import gameResources.FameStars

class WorkOfArt {

	public ArtType art;//enum
	public TicketBonus tickets = new TicketBonus();
	public  int promo;
	
	public WorkOfArt(WorkOfArt v)
	{
		if(v != null)
		{
			this.art = v.art;
			this.promo = v.promo;

			for(item in v.tickets.tickets)
			{
				this.tickets.tickets.add(item);
			}
			
		}
	}
}
