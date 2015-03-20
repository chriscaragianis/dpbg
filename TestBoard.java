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
		
		nodes.add(new Compass4Node());
		agents.add(new ConsoleInputAgent());
	}
	
	/**
	 *
	 */
	 private void addEdge(int tail, int head)
	    {
	       
	        List<Integer> candidates = new ArrayList<Integer>();
	        for (int i = 0; i < rooms.size(); i++)
	            if (rooms.get(i).isOpen() && i != index && !rooms.get(index).isNbr(i))
	            {
	                candidates.add(i);
	            }
	        for (int j = 0; j < candidates.size(); j++)
	            if (choice <= (double)(j + 1)/(candidates.size() + 1))
	            {
	                rooms.get(index).connect(candidates.get(j));
	                rooms.get(candidates.get(j)).connect(index);
	                return;
	            }
	        rooms.add(new Room());
	        rooms.get(index).connect(rooms.size()-1);
	        rooms.get(rooms.size()-1).connect(index);
	    }
	/**
	 *
	 */
	
}
