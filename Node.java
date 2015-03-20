import java.util.*;

abstract class Node
{
	private Hashtable<String, Node> doorLabels;
	
	abstract public void addNbr();
	abstract public boolean isOpen(Node source);
	
	public Node getDir(String key)
	{
		return doorLabels.get(key);
	}
	
	public boolean checkDir(String key)
	{
		return doorLabels.containsKey(key);
	}
	
	
	
}

	