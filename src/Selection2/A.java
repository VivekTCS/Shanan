package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {


	public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/");
	 
	 Thread.sleep(4000);
	 WebElement vvk = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	 Thread.sleep(4000);
	 Select s=new Select(vvk);
	 Thread.sleep(4000);
	 s.selectByValue("");
	 
	 
	 
	 
}
}