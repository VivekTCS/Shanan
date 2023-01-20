package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		String t1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
		System.out.println(t1);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String t2 = driver.findElement(By.xpath("//a[text()='AddHasContext']")).getText();
		System.out.println(t2);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		String t3 = driver.findElement(By.xpath("//th[text()='Description']")).getText();
		System.out.println(t3);
	}
}
