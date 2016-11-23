package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selenium.Driver;
import Utilities.factor;

public class Support 
{

	private static String originalHandle;
	
	public static class set
	{
		public static String url()
		{
			originalHandle = Driver.Instance.getCurrentUrl();
			return originalHandle;
		}
	}
	
	
	public static class FaqElement
	{
		
		public static class Printer
		{	
			
			public static void click()
			{
				
				Driver.restart();
				Driver.Instance.get(originalHandle);
				
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div/div/div[2]/div/div/ul/li/a"));
				ele.click();
				
				int i=0;
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div[2]/div/div/div/div/div/ul/li/a"));
				for(WebElement test: each)
				{
					i++;
					if(i==18)
					{
						break;
					}else
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
						
								
				}

			}
			
		}
		
		public static class Robot
		{
			
			public static void click()
			{
				
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[2]/div/div/div/ul/li[2]/a"));
				ele.click();
			
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div/div/div/div[2]/ul/li/a"));
				for(WebElement test: each)
				{
					
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
										
				}
				
			}
			
		}
	}
	
	public static class TutorialVideoElement
	{
		public static class Printer
		{	
			
			public static void click()
			{
					
				Driver.restart();	
				Driver.Instance.get(originalHandle);
				
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div/div/div[2]/div/div/ul/li[2]/a"));
				ele.click();
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div[2]/div/div/div/div/div/ul/li/a"));
				for(WebElement test: each)
				{
					
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
												
				}

			}
			
		}
		
		public static class Robot
		{	
		
			public static void click()
			{
				
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[2]/div/div/div/ul/li[2]/a"));
				ele.click();
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div/div/div/div[2]/div/div/div/ul/li/a"));
				for(WebElement test: each)
				{
					
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
					
								
				}
				
			}
		}
	}
	
	public static class ProductWarrantyElement
	{
		public static class Printer
		{	
			
			public static void click()
			{
				
				Driver.restart();
				
				Driver.Instance.get(originalHandle);
				
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[2]/div/div[2]/ul/li[3]/a"));
				ele.click();
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div[2]/div/div/div/div/div/ul/li/a"));
				for(WebElement test: each)
				{
					
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
								
				}
				
			}
			
		}
		
		public static class Robot
		{	
			
			public static void click()
			{
				factor.clear();
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[2]/div/div/div/ul/li[2]/a"));
				ele.click();
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//div/div/div/div[2]/div/div/div/ul/li/a"));
				for(WebElement test: each)
				{
					
						factor.string.add(test.getText());
						factor.url.add(test.getAttribute("href"));
						test.sendKeys(factor.inNewTab);
										
				}
		
			}
			
		}
	}
}
