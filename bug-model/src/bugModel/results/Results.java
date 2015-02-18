package bugModel.results;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import bugModel.util.Debug;

/**
 * Log File for Bug Class
 */
public class Results implements Display, FileLog, StoreMovements {
	private ArrayList<Integer> log;// = new ArrayList<Integer>();
	
	/**
	 * Default Constructor for Results
	 */
	public Results(){
		this.log = new ArrayList<Integer>();
		Debug.printToStdout(4,"Results Constructor Called");
	}
	
	/**
	 * Adds a movement of a Bug to the Log File
	 * @param  direction represents up, down, left, or right
	 * @return           Error Codes
	 */
	public int addMovement(int direction){
		log.add(direction);
		Debug.printToStdout(3,"addMovement(int direction) called");
		Debug.printToStdout(2,"Member added to Results");
		return 0;
	}

	/**
	 * Case !list.empty : Remove last element of list
	 * Case list.empty  : Append 0 to list
	 * @return            Error Codes
	 */
	public int removeLast(){
		Debug.printToStdout(3,"removeLast() called");
		Debug.printToStdout(2,"Member removed from Results");
		if(log.isEmpty()){
			log.add(0);
		}
		else{
			log.remove(log.size()-1);
		}
		return 0;
	}

	/**
	 * Writes contents of this Results object to STDOUT
	 * @return Error Codes
	 */
	public int writeToScreen(){
		Debug.printToStdout(3,"writeToScreen() called");
		for(int i=0; i<log.size();i++){
			System.out.print(log.get(i));
		}
		System.out.print("\n");
		return 0;
	}
	
	/**
	 * Writes Results within the index range [a,b] to STDOUT
	 * @param a Low end of Range
	 * @param b High end of Range
	 * @return Error Codes
	 */
	public int writeRangeToScreen(int a, int b){
		Debug.printToStdout(3,"writeRangeToScreen(int a, int b) called");
		if(a >= 0 && a < log.size() && b >= a && b < log.size()){
			for(int i=a; i<b; i++){
				System.out.print(log.get(i));
			}
			System.out.print("\n");
			return 0;
		}
		else{
			return -1;
		}
	}

	/**
	 * Writes contents of this Results object to file
	 * @param fileName String name of the file to be written to
	 * @return         Error Codes
	 */
	public int writeToFile(String fileName){
		Debug.printToStdout(3,"writeToFile(String fileName) called");
		try{
			PrintWriter writer = new PrintWriter(fileName);
			for(int i=0; i<log.size(); i++){
				writer.print(log.get(i));
			}
			writer.print("\n");
			writer.close();
			return 0;
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	/**
	 * Writes contents of this Results object within the index 
	 * range [a,b] to file
	 * @param fileName String name of the file to be written to
	 * @param a        Low end of Range
	 * @param b        High end of Range
	 * @return         Error Codes
	 */
	public int writeRangeToFile(String fileName, int a, int b){
		Debug.printToStdout(3,"writeRangeToFile(String fileName, int a, int b) called");
		try{
			PrintWriter writer = new PrintWriter(fileName);
			if(a >= 0 && a < log.size() && b >= a && b < log.size()){
				for(int i=a; i<b; i++){
					writer.print(log.get(i));
				}
				writer.print("\n");
				writer.close();
				return 0;
			}
			else{
				return -1;
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}
	/**
	 * Returns a string representation of this Results object
	 * @return String Representation of this Results Object
	 */
	public String toString(){
		Debug.printToStdout(3,"toString() called");
		String temp = "";
		for(int i=0; i<log.size(); i++){
			temp = temp + log.get(i);
		}
		return temp;
	}

} // end public class Results


