package bugModel.util;

/**
 * Static Class for Debugging
 */
public final class Debug {
	private static int DEBUG_VALUE = 0;

	/**
	 * Setter for DEBUG_VALUE
	 * @param a int 0-4 for setting Debug Levels
	 */
	public static void setDebug(int a){
		if(a < 5 && a >= 0){
			DEBUG_VALUE = a;
		}
	}	

	/**
	 * Prints an arbitrary Debug Message to the Terminal
	 * @param level        Type of Error Message to Print
	 * @param debugMessage Actual Arbitrary Message to Print to Terminal
	 */
	public static void printToStdout(int level, String debugMessage){
		if(DEBUG_VALUE == level){
			System.out.println(debugMessage);
		}
	}
}
