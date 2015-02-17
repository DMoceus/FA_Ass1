package bugModel.bug;
import bugModel.results.Results;
import bugModel.results.StoreMovements;
import bugModel.results.FileLog;
import bugModel.results.Display;

public class Bug implements AllDirectionsBug {
	public Results res = new Results();

	public int moveRight(){
		return ((StoreMovements)res).addMovement(1);	
	}

	public int moveLeft(){
		return ((StoreMovements)res).addMovement(2);
	}

	public int moveUp(){
		return ((StoreMovements)res).addMovement(3);
	}

	public int moveDown(){
		return ((StoreMovements)res).addMovement(3);
	}

	public int undoPrev(){
		return ((StoreMovements)res).removeLast();
	}

    public String toString() {
	String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
	return retValue;
    }

}
