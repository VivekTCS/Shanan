package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test

	public void tc1 () {

		
		Reporter.log("helloooooooooo",true);
		
	}

	@Test(timeOut = 60000)

	public void tc2() {
		Reporter.log("how r you?",true);
	
	}
}
