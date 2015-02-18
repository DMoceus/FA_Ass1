
package bugModel.driver;

import bugModel.results.FileLog;
import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.results.StoreMovements;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;

public class Driver{

	public static void main(String args[]) {

		if(args.length < 2) {
			System.err.println("Usage:  FIXME\n");
			System.exit(1);
		}
		
		//AllDirectionsBug a = new Bug();
		Display res = new Results();
		AllDirectionsBug b = new Bug((Results)res);
		System.out.println(b);
		

		b.moveLeft();
		b.moveRight();
		b.moveRight();
		b.moveLeft();
		b.moveUp();
		b.moveDown();
		b.moveDown();
		b.moveUp();
		b.undoPrev();
		b.undoPrev();
		((Display)res).writeToScreen();
		((FileLog)res).writeToFile(args[1]);
		// All test cases

	} // end main(...)

} // end public class Client

