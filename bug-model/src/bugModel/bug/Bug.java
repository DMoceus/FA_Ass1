package bugModel.bug;
import bugModel.results.Results;
import bugModel.results.StoreMovements;
import bugModel.results.FileLog;
import bugModel.results.Display;
import bugModel.util.Debug;


/**
 * Simulates a Vokswagen Bettle Convertible from 2015
 */
public class Bug implements AllDirectionsBug {
	public Results res;
	
	/**
	 * Default initializer for Bug
	 */
	public Bug(){
		res = new Results();
		Debug.printToStdout(4,"Bug Default Constructor");
	}
	
	/**
	 * Overloaded Constructor for Bug
	 * @param resIn A Results object that can be shared between Bugs
	 */
	public Bug(Results resIn){
		res = resIn;
		Debug.printToStdout(4,"Bug 1-Argument Constructor");
	}
	
	/**
	 * Moves the bug Right One and writes to the Results Object
	 * @return Debug Data
	 */
	public int moveRight(){
		Debug.printToStdout(3,"moveRight() called");
		return ((StoreMovements)res).addMovement(1);
	}

	/**
	 * Moves the bug Left One and writes to the Results Object
	 * @return Debug Data
	 */
	public int moveLeft(){
		Debug.printToStdout(3,"moveLeft() called");
		return ((StoreMovements)res).addMovement(2);
	}

	/**
	 * Moves the bug Up One and writes to the Results Object
	 * @return Debug Data
	 */
	public int moveUp(){
		Debug.printToStdout(3,"moveUp() called");
		return ((StoreMovements)res).addMovement(3);
	}

	/**
	 * Moves the bug Down One and writes to the Results Object
	 * @return Debug Data
	 */
	public int moveDown(){
		Debug.printToStdout(3,"moveDown() called");
		return ((StoreMovements)res).addMovement(3);
	}

	/**
	 * Undoes previous Action in Results object
	 * @return Debug Data
	 */
	public int undoPrev(){
		Debug.printToStdout(3,"undoPrev() called");
		return ((StoreMovements)res).removeLast();
	}

	/**
	 * Returns a valid string representation of this Bug
	 * @return String Representation of this Class
	 */
    public String toString() {
		String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
		Debug.printToStdout(3,"toString() called");
		return retValue;
    }

}
