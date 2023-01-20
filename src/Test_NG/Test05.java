package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test05 {

	@Test
	public void tc1() {
		Reporter.log("1st tc is fail",true);
		Assert.fail();
	}
	@Test
	public void tc2() {
		Reporter.log("2nd tc is fail",true);
		Assert.fail();
	}
	@Test
	public void tc3() {
		Reporter.log("3rd tc is fail",true);
		Assert.fail();
	}
	@Test
	public void tc4() {
		Reporter.log("4th tc is fail",true);
		Assert.fail();
	}
	@Test
	public void tc5() {
		Reporter.log("5th tc is pass",true);
	}
}
