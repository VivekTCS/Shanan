package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz12/login.do");
		
		driver.findElement(By.id("username")).sendKeys("shivarkarvivek28@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("H3LvHzsY");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String expT="actiTIME - Login";
		String actT = driver.getTitle();
		
		if(expT.equals(actT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
	}
}
