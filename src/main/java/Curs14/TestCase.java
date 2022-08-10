package Curs14;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ConditionalTestSkip.class)
public class TestCase {

	@Test
	public void testCase1() {
		System.out.println("Run test case 1 selenium logic here");
	}
	
	@Test
	@DeOnly
	public void testCase2() {
		System.out.println("Run test case 2 selenium logic here");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Run test case 3 selenium logic here");
	}
	
}
