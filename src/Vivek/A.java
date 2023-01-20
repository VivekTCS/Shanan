package Vivek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver Vivek=new ChromeDriver();
	Vivek.get("https://www.facebook.com/");
	
	
	
}
}
