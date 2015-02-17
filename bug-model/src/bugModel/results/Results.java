package bugModel.results;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Results implements Display, FileLog, StoreMovements {
	private ArrayList<Integer> log;// = new ArrayList<Integer>();
	
	public Results(){
		this.log = new ArrayList<Integer>();
	}
	
	public int addMovement(int direction){
		log.add(direction);
		return 0;
	}

	public int removeLast(){
		if(log.isEmpty()){
			log.add(0);
		}
		else{
			log.remove(log.size()-1);
		}
		return 0;
	}

	public int writeToScreen(){
		for(int i=0; i<log.size();i++){
			System.out.print(log.get(i));
		}
		System.out.print("\n");
		return 0;
	}
	
	public int writeRangeToScreen(int a, int b){
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

	public int writeToFile(String fileName){
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

	public int writeRangeToFile(String fileName, int a, int b){
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
	
	public String toString(){
		String temp = "";
		for(int i=0; i<log.size(); i++){
			temp = temp + log.get(i);
		}
		return temp;
	}

} // end public class Results


