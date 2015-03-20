import java.util.*;
import java.io.Console;

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
  
 	}
 public Node moveQuery()
 {
	 System.out.println("You are at " + loc.getLabel());
	 
	 Scanner in = new Scanner(System.in);
	 while(!in.hasNextLine()){};
	 String dir = in.nextLine();
	 in.close();
	 if (loc.checkDir(dir))
	  return loc.getDir(dir);
	 else 
	 {
		 System.out.println("You can't go that way.");
		 return loc;
	 }
 }
 
 public void setLoc(Node l)
 {
  loc = l;
 }
 public Node getLoc()
 {
  return loc;
 }

}
