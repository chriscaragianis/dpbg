abstract class Agent
{
	protected Node loc;
	
	abstract public Node getLoc();
	abstract public Node moveQuery();
	abstract public void setLoc(Node l);
	
	
}	