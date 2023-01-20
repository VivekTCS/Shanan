package Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//typecast takesscreenshot interface
		TakesScreenshot ts=(TakesScreenshot) driver;
	    //take the screenshot using get shreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//create the object of file class
		File dest=new File("C:\\Users\\Shri\\Desktop\\Screenshot\\facebook.png");
		//we need convert screenshot from src to destination
		Files.copy(src, dest);
		System.out.println("What happen");
	}
}
