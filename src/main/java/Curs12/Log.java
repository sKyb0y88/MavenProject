package Curs12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	public static Logger Log = LogManager.getLogger(Log.class);
	
	public static void info(String message) {
		Log.info(message);
	}

	
	public static void error(String message) {
		Log.error(message);
	}
	
	public static void error(Throwable throwMessage) {
		Log.error(throwMessage);
	}

}
