import java.util.*;

abstract class Board {

	protected List<Node> nodes;
	protected List<Agent> agents;
	
	abstract protected void addEdge(int tail, int head);
	//abstract protected  
	
	public void update()
	{
		Node target;
		for (Agent v: agents)
		{
			target = v.moveQuery();
			if (target.isOpen(v.getLoc()))
				v.setLoc(target);
	
		}
	}
	
	
}
	
	