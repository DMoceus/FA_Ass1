package bugModel.bug;
import bugModel.results.Results;
import bugModel.results.StoreMovements;
import bugModel.results.FileLog;
import bugModel.results.Display;
import bugModel.util.Debug;

public class Bug implements AllDirectionsBug {
	public Results res;
	
	public Bug(){
		res = new Results();
		Debug.printToStdout(4,"Bug Default Constructor");
	}
	
	public Bug(Results resIn){
		res = resIn;
		Debug.printToStdout(4,"Bug 1-Argument Constructor");
	}

	public int moveRight(){
		Debug.printToStdout(3,"moveRight() called");
		return ((StoreMovements)res).addMovement(1);
	}

	public int moveLeft(){
		Debug.printToStdout(3,"moveLeft() called");
		return ((StoreMovements)res).addMovement(2);
	}

	public int moveUp(){
		Debug.printToStdout(3,"moveUp() called");
		return ((StoreMovements)res).addMovement(3);
	}

	public int moveDown(){
		Debug.printToStdout(3,"moveDown() called");
		return ((StoreMovements)res).addMovement(3);
	}

	public int undoPrev(){
		Debug.printToStdout(3,"undoPrev() called");
		return ((StoreMovements)res).removeLast();
	}

    public String toString() {
		String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
		Debug.printToStdout(3,"toString() called");
		return retValue;
    }

}
