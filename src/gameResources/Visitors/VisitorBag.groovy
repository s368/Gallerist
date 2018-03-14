package gameResources.Visitors

import utils.Deck
import gameResources.VisitorColor
import gameResources.textDB

class VisitorBag {
	public Deck<Visitor> bag = new Deck<Visitor>();
	
	public VisitorBag(a = [])
	{
		Visitor vis = new Visitor();

		for(item in a)
		{
			for(rose in 0..<item.rose)
			{
				vis.color = VisitorColor.Rose;
				this.addCopy(vis);
			}
			for(brown in 0..<item.brown)
			{
				vis.color = VisitorColor.Brown;
				this.addCopy(vis);
			}
			for(rose in 0..<item.white)
			{
				vis.color = VisitorColor.White;
				this.addCopy(vis);
			}
		}
		
		this.bag.shuffle();
	}
	
	public addCopy(Visitor vOld)
	{
		Visitor vNew = new Visitor(vOld);
		this.bag.localt.add(vNew);
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
