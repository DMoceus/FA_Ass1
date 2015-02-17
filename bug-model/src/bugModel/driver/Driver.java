
package bugModel.driver;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;

public class Driver{

	public static void main(String args[]) {

		if(args.length < 2) {
			System.err.println("Usage:  FIXME\n");
			System.exit(1);
		}
		
		AllDirectionsBug a = new Bug();
		//Display res = new Results();
		//AllDirectionsBug b = new Bug(res);
		//System.out.println(b);

		// All test cases

	} // end main(...)

} // end public class Client

