package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test02 {
@Test
public void TC1() {
	Reporter.log("1st tc is pass",true);
	
}
@Test
public void TC2() {
	Reporter.log("2nd tc is pass",true);
	Assert.fail();
}
@Test
public void TC3() {
	Reporter.log("3rd tc is pass",true);
}
}
