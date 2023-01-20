package Selection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_handling01 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//select day list box
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.xpath("//select[(@id='day')]"));
		//creat object of select class
		Thread.sleep(4000);
		Select s=new Select(day);
		//use select class method
		Thread.sleep(4000);
		s.selectByVisibleText("12");
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select v=new Select(month);
		Thread.sleep(4000);
		v.selectByVisibleText("Mar");
		Thread.sleep(4000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select a=new Select(year);
		Thread.sleep(4000);
		a.selectByVisibleText("2003");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
	}
	
}
