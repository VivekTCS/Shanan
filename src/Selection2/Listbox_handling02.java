package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handling02 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(3000);
		Select s=new Select(day);
		s.selectByVisibleText("23");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		Select m=new Select(month);
		m.selectByVisibleText("Mar");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(3000);
		Select a=new Select(year);
		a.selectByVisibleText("1987");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}
}
