package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute01 {
 
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trade.angelone.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Login via Client ID']")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control client-id-input']")).sendKeys("V327089");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block btn-lg']")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-primary btn-block btn-lg')])[4]"));
	
	
	}
}
