package gameResources.Visitors

import utils.Deck
import gameResources.VisitorColor
import gameResources.textDB

class VisitorBag {
	public Deck<Visitor> bag = new Deck<Visitor>();
	
	public VisitorBag(a = [])
	{
		for(item in a)
		{
			for(rose in 0..<item.rose)
			{
				Visitor vis = new Visitor();
				vis.color = VisitorColor.Rose;
				this.bag.localt.add(vis);
			}
			for(brown in 0..<item.brown)
			{
				Visitor vis = new Visitor();
				vis.color = VisitorColor.Brown;
				this.bag.localt.add(vis);
			}
			for(rose in 0..<item.white)
			{
				Visitor vis = new Visitor();
				vis.color = VisitorColor.White;
				this.bag.localt.add(vis);
			}
		}
		
		this.bag.shuffle();
	}

	static main(args) {
		
		VisitorBag vb = new VisitorBag(textDB.visitorList);
		
		println("number of visitors =" + vb.bag.localt.size());
		int i = 1;
		for(item in vb.bag.localt)
		{
			println("i=" + i + " color =" + item.color);
			i++;
		}
		
	}

}
