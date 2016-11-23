package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

	public static WebDriver Instance;
	
	
	public static WebDriver Initialize()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		Instance = new ChromeDriver(options);
		Instance.manage().window().maximize();
		
		return Instance;
		
	}
	
	public static void restart()
	{
		Driver.Instance.close();
		Driver.Instance.quit();
		Driver.Initialize();
	}
}
