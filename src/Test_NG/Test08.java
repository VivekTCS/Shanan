package Test_NG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test08 {
@Test

public void tc1 () {

	
	Reporter.log("helloooooooooo",true);
	
}

@Test

public void tc2() {
	Reporter.log("how r you?",true);
	Assert.fail();
}
}
