package Curs12;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestExample {
	
	@NeedsSpecialSetup
	@Test
	public void testCeva() {
		System.out.println("Print test ceva");
	}
	
	@NeedsSpecialSetup
	@Test
	public void testAltceva() {
		System.out.println("Print test altceva");
	}
	
	@AfterMethod
	public void testAnnotation(Method method) {
		
		NeedsSpecialSetup needsSpecialSetup = method.getAnnotation(NeedsSpecialSetup.class);
		
		if(needsSpecialSetup == null) {
			return;
		}
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());	
		System.out.println("Inside after method: " + timestamp);
	}

}
