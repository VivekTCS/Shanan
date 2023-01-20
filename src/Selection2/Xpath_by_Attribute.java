package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute {

	public static void main(String[] args) {
		
		//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/ht1/login.do");
		//enter un
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shivarkarvivek28@gmail.com");
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("$SydySUA");
		//click on login btn
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//varify user should navigate to home page
		String expT="actiTIME - Login";
		String actT = driver.getTitle();
		System.out.println(actT);
		
		if(expT.equals(actT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
	}
}
