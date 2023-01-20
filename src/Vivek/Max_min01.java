package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_min01 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shri\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trade.angelone.in/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		String expT="Angel One";
		String actT=driver.getTitle();
		
		if(expT.equals(actT)) {
		System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
		driver.close();
	}
}
