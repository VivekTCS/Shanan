package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_currentUrl01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		
	String expT="https://online.actitime.com/xyz12/login.do";
	String actT=driver.getCurrentUrl();
	
	if(expT.equals(actT)) {
		System.out.println("tc is pass");
	}
	else {
		System.out.println("tc is fail");
	}
	}
	
}
