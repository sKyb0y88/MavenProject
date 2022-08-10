package Curs12;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(java.lang.annotation.ElementType.METHOD)
public @interface RunMultipleTimes {
	
	int times();
	
	//@RunMultipleTimes(times=4)

}
