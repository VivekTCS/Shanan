package Vivek;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Setposition01 {
 
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	 Dimension d=new Dimension(200, 100);
	 driver.manage().window().setSize(d);
	 Thread.sleep(2000);
    
	 Point p=new Point(300, 100);
	 driver.manage().window().setPosition(p);
	}
}
