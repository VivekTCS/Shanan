package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod {
@Test
public void login() {
	Reporter.log("running login",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("running logout",true);
}
}
