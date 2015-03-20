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
	
	public String getLabel()
	{
		return label;
	}
	
	public void addNbr(String key, Node nd)
	{
		doorLabels.put(key, nd);
	}
	
	public boolean isOpen(Node source)
	{
		return true;
	}
	
	public Node getDir(String key)
	{
		return doorLabels.get(key);
	}
	
	public boolean checkDir(String key)
	{
		return doorLabels.containsKey(key);
	}
	
	
	
}

	