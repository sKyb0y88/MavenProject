package Curs12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {

	final static Logger logger = LogManager.getLogger(LogExample.class);
	
	
	public static void main(String[] args) {
		
		LogExample obj = new LogExample();
		obj.printLog();
	
	}
	
	public void printLog() {
		
		logger.debug("This is debug level");
		logger.info("This is info level");
		logger.warn("This is warn level");
		logger.error("This is error level");
		logger.fatal("This is fatal level");
		
	}

}
