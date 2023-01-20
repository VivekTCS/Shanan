package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shri\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act=new Actions(driver);
		/*act.moveToElement(target).perform();
		act.contextClick(target).perform();
		act.click(target).perform();
		
		act.moveToElement(target).doubleClick().perform();*/
		
		act.moveToElement(target).contextClick().doubleClick().perform();
	}
}
