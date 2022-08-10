package Curs12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)
public class TestLogging {
	
	
	@Test
	public void testLogging() {
		Log.info("This is a log test");
	}
	
	@Test
	public void testProduct() {
		Log.info("This is a product test");
		assertTrue(false);
	}
	
	
	
	
	

}
