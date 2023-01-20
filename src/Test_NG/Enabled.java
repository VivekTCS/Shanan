package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test
public void TC1() {
	Reporter.log("TC1 my first program in testng",true);
}
@Test(enabled = false)
public void TC2() {
	Reporter.log("TC2 my 2nd program in testng",true);
}
}
