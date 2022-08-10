package Curs12;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	public void onTestStart(ITestResult result) {
	
		Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("Start test case: " + result.getMethod().getMethodName());
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	
		Log.info("Start time: " + timestamp);
		Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	

	public void onTestSuccess(ITestResult result) {
		
		Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("Passed test case: " + result.getMethod().getMethodName());
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	
		Log.info("End time: " + timestamp);
		Log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	public void onTestFailure(ITestResult result) {
		
		Log.error("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.error("Failed test case: " + result.getMethod().getMethodName());
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	
		Log.error("Failed time: " + timestamp);
		Log.error(result.getThrowable().toString());
		Log.error("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

	
	
	
	
	
}
