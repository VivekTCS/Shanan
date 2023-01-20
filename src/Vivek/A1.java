package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://trade.angelone.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/login/");
			
			
	}
	
	
	
	
}
