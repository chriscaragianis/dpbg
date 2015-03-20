import java.util.*;

/**
 * 
 */

/**
 * @author chriscaragianis
 *
 */
public class TestBoard extends Board {

	/**
	 * 
	 */
	public TestBoard() 
	{
		nodes = new ArrayList<Node>();
		agents = new ArrayList<Agent>();
		
		nodes.add(new Node("UpLeft"));
		nodes.add(new Node("UpRight"));
		nodes.add(new Node("DownRight"));
		nodes.add(new Node("DownLeft"));
		
		nodes.get(0).addNbr("East", nodes.get(1));
		nodes.get(1).addNbr("South", nodes.get(2));
		nodes.get(2).addNbr("West", nodes.get(3));
		nodes.get(3).addNbr("East", nodes.get(0));
		
		agents.add(new ConsoleInputAgent());
		agents.get(0).setLoc(nodes.get(0));
	}
	
}
