package Selection2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handling03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByVisibleText("23");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m=new Select(month);
		m.selectByVisibleText("Feb");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByVisibleText("2022");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}
}
