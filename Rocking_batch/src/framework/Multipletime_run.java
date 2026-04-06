package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multipletime_run {
	
	@Test(invocationCount = 4)
	public void test() {
		Reporter.log("Hii Baidya",true);
	}

}
