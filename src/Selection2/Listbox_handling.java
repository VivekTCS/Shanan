package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handling {

	public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 Thread.sleep(4000);
	 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	 Select s=new Select(day);
	 Thread.sleep(4000);
	s.selectByValue("10");
	Thread.sleep(4000);
	s.selectByIndex(3);
	}
	
}
