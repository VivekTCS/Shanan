package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser01 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 20000",Keys.ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(10000);
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allwin);
		
		String mainid = al.get(0);
		System.out.println(mainid);
		
		driver.switchTo().window(al.get(1));
		String cwind = al.get(1);
		System.out.println(cwind);
		Thread.sleep(10000);
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		driver.switchTo().window(al.get(0));
		String t2 = driver.getTitle();
		System.out.println(t2);
		
		
		
	}
}
