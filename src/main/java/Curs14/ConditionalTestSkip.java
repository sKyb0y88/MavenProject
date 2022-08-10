package Curs14;

import java.lang.reflect.Method;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;

public class ConditionalTestSkip implements IInvokedMethodListener {

	public static String country = "FR";

	@Override
	public void beforeInvocation(IInvokedMethod invokeMethod, ITestResult testResult) {

		Method method = testResult.getMethod().getConstructorOrMethod().getMethod();

		if (method == null) {
			return;
		}
		if (method.isAnnotationPresent(DeOnly.class) && !country.equals("DE")) {

			throw new SkipException("This test should run only on DE environement!");
		}
		if (method.isAnnotationPresent(RoOnly.class) && !country.equals("RO")) {

			throw new SkipException("This test should run only on RO environement!");
		}

		return;
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

	}

}
