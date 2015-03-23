import java.util.*;

public class Node
{
	private String label;
	private Hashtable<String, Node> doorLabels;
	
	public Node(String lbl)
	{
		label = lbl;
		doorLabels = new Hashtable<String, Node>();
	}
	
	public void addNbr(String key, Node nd)
	{
		doorLabels.put(key, nd);
	}
	
	public boolean checkDir(String key)
	{
		return doorLabels.containsKey(key);
	}
	
	public Node getDir(String key)
	{
		return doorLabels.get(key);
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public boolean isOpen(Node source)
	{
		if (!source.equals(this))
			return true;
		return false;
		
	}
	
	
	
}

	