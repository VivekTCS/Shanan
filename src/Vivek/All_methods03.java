package Vivek;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_methods03 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Dimension d=new Dimension(200, 500);
		driver.manage().window().setSize(d);
		Point p=new Point(500, 300);
		driver.manage().window().setPosition(p);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
