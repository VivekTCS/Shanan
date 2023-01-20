package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains_using_attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("shivarkarvivek28@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("H3LvHzsY");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
	}
}
