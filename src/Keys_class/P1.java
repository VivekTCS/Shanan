package Keys_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shivarkarvivek28@gmail.com",Keys.TAB,"H3LvHzsY",Keys.ENTER);
		
	}
}
