package Screenshots;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A03 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement abc = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src = abc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Shri\\Desktop\\Screenshot\\fb.png");
		Files.copy(src, dest);
	}
}
