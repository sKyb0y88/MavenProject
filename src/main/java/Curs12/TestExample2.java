package Curs12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample2 {
	
	
	@Test(invocationCount = 4)
	public void runMultipleTimesWithTestNg() {
		
		System.out.println("testng print");
	}
	
	@RunMultipleTimes(times=3)
	public void runMultipleTimesWithCustomAnnotation() {
		System.out.println(" custom print");
	}
	
	@BeforeClass
	public void setUp() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		TestExample2 testObj = new TestExample2();
		
		for(Method method : testObj.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(RunMultipleTimes.class)) {
				
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
				
				for(int i = 0; i < annotation.times(); i++) {
				
					method.invoke(testObj);
					
				}
			}
			
		}
	}

}
