package bugModel.util;

public final class Debug {
	private static int DEBUG_VALUE = 0;

	//private Debug(){
	//	DEBUG_VALUE = 0;
	//}

	public static void setDebug(int a){
		if(a < 5 && a >= 0){
			DEBUG_VALUE = a;
		}
	}	

	public static void printToStdout(int level, String debugMessage){
		if(DEBUG_VALUE == level){
			System.out.println(debugMessage);
		}
	}
}
