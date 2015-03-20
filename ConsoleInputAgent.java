import java.util.*;

/**
 * 
 */

/**
 * @author chriscaragianis
 *
 */
public class ConsoleInputAgent extends Agent {

	/**
	 * 
	 */
	public ConsoleInputAgent() {
		// TODO Auto-generated constructor stub
	}
	public Node moveQuery()
	{
		Scanner in = new Scanner(System.in);
		String dir = in.nextLine();
		in.close();
		if (loc.checkDir(dir))
			return loc.getDir(dir);
		else 
		{
			System.out.println("You can't go that way.");
			return moveQuery();
		}
	}

}
