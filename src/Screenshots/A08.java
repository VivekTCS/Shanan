package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A08 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     WebElement abc = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
	     
	     File src = abc.getScreenshotAs(OutputType.FILE);
	     File dest=new File("C:\\Users\\Shri\\Desktop\\Screenshot\\a1.png");
	     Files.copy(src, dest);
	}
}
