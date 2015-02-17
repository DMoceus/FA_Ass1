package bugModel.results;


public interface FileLog {
    // add appropriate method 
	public int writeToFile(String fileName);
	public int writeRangeToFile(String fileName, int a, int b);

} 
