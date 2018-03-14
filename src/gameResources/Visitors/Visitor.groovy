package gameResources.Visitors

import gameResources.VisitorColor

class Visitor {
	
	public VisitorColor color;
	
	public Visitor(v)
	{
		if(v != null)
		{
			this.color = v.color;
		}
	}
}
