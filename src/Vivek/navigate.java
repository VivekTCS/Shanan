package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
 
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://trade.angelone.in/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/login/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
