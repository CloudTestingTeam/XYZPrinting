package Utilities;

//import java.util.ArrayList;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

import Selenium.Driver;

public class CheckWebsite 
{
	
	public static String url;
	
	
	public static void Status(String link)
	{	
		
		Driver.Instance.get(link);
		
		url = link;
		
		ExtentReport.title("if Page is Available");
		
		if(Driver.Instance.getTitle().equals("Application error"))
		{
			ExtentReport.log500Error(Region.pageIsAt);
			ExtentReport.screenshots();
			ExtentReport.tear();
		}
		else if(Driver.Instance.getTitle().equals("404 Not Found"))
		{
			ExtentReport.log404Error(Region.pageIsAt);
			ExtentReport.screenshots();
			ExtentReport.tear();
		}
		else if(Driver.Instance.getTitle().equals("502 Proxy Error"))
		{
			ExtentReport.log502Error(Region.pageIsAt);
			ExtentReport.screenshots();
			ExtentReport.tear();
		}
		else if(Driver.Instance.getTitle().equals("503 Service Temporarily Unavailable"))
		{
			ExtentReport.log503Error(Region.pageIsAt);
			ExtentReport.screenshots();
			ExtentReport.tear();
		}
		else
		{	
			ExtentReport.logPass(Region.pageIsAt);
			ExtentReport.screenshots();
			ExtentReport.tear();
		}
		
		//Driver.Instance.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		//ArrayList<String> tabs = new ArrayList<String> (Driver.Instance.getWindowHandles());
		 
		//Driver.Instance.switchTo().window(tabs.get(i));
		
		//num();
		
		/*
		Driver.Instance.close();
		Driver.Instance.quit();
		Driver.Initialize();
		*/
	}
	
	/*public static int num()
	{
		i++;
		return i;
	}*/
	
}
