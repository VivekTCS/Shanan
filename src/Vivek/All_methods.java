package Vivek;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_methods {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		Dimension d=new Dimension(200, 100);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p=new Point(300, 500);
		driver.manage().window().setPosition(p);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		String link = driver.getCurrentUrl();
		System.out.println(link);
		
		
	}
}
