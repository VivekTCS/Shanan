package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		//Implicit wait(global wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    //bye default selenium focus to main webpage
		//switch to 1st iframe
		driver.switchTo().frame("packageListFrame");
		//for ou confirmation take any element on 1st frame and print it
		String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		System.out.println(t1);
		//switch to from 1st frame tomain webpage
		driver.switchTo().defaultContent();
		//now jump from main page to 2nd frame
		driver.switchTo().frame("packageFrame");
		String t2 = driver.findElement(By.xpath("//a[text()='Actions'][1]")).getText();
		System.out.println(t2);
		//again control goes to main page
		driver.switchTo().defaultContent();
		//now jump from main page to 3rd page
		driver.switchTo().frame("classFrame");
		String t3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(t3);
		
		
		
		
		
	}
}
