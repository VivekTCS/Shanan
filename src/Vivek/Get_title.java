package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver vvk=new ChromeDriver();
		vvk.get("https://trade.angelone.in/");
		String Arjun=vvk.getTitle();
		System.out.println(Arjun);
	}
}
