package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Selenium.Driver;
import Utilities.factor;

public class eShop 
{

	public static class IndexElement
	{
		
		public static void click()
		{
			
			factor.clear();
			
			java.util.List<WebElement> each = Driver.Instance.findElements(By.className("container"));
			
			for(WebElement test: each)
			{	
				
				java.util.List<WebElement> bannerImage = test.findElements(By.tagName("img"));
				
				for(WebElement test2: bannerImage)
				{		
					factor.icon.add(test2.getAttribute("src"));
				}
				
				
				java.util.List<WebElement> bannerLink = test.findElements(By.tagName("a"));
				
				for(WebElement test2: bannerLink)
				{		
					factor.url.add(test2.getAttribute("href"));
					test2.sendKeys(factor.inNewTab);
				}				
					
			}
			
		}
	}
	
	public static class PrinterElement
	{
		
		public static void click()
		{
			
			factor.clear();
			
			WebElement ele = Driver.Instance.findElement(By.xpath("//div[3]/a/div/div/h1"));
			ele.click();
			
			java.util.List<WebElement> each = Driver.Instance.findElements(By.cssSelector("li.textCenter.inline-b.relative.col-4.sm-col-12.mb-col-12.ng-scope"));		
			for(WebElement test: each)
			{	
				factor.string.add(test.getText());
				
				java.util.List<WebElement> printer = test.findElements(By.tagName("a"));
				for(WebElement test2: printer)
				{		
					factor.url.add(test2.getAttribute("href"));
					test2.sendKeys(factor.inNewTab);
				}
							
			}

		}
		
	}
	
	public static class PrintingMaterialElement
	{
		
		public static void click()
		{
			
			factor.clear();
			
			Driver.Instance.findElement(By.xpath("//section/ul/li[2]")).click();
			
			java.util.List<WebElement> each = Driver.Instance.findElements(By.cssSelector("li.textCenter.inline-b.relative.col-4.sm-col-12.mb-col-12.ng-scope"));	
			for(WebElement test: each)
			{	
				factor.string.add(test.getText());
				
				java.util.List<WebElement> printer = test.findElements(By.tagName("a"));
				for(WebElement test2: printer)
				{		
					factor.url.add(test2.getAttribute("href"));
					test2.sendKeys(factor.inNewTab);
				}
				
			}
		}
	
	}
	
	public static class SparePartsElement
	{
		
		public static class daVinciJrSeries
		{
			
			public static void click()
			{
				
				factor.clear();
				
				Driver.Instance.findElement(By.xpath("//section/ul/li[3]")).click();		
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//li/p"));			
				for(WebElement test2: each)
				{
					
					factor.string.add(test2.getText());	
				
				}
				
				
				java.util.List<WebElement> each2 = Driver.Instance.findElements(By.xpath("//li/div/a"));		
				for(WebElement test: each2)
				{
					
					factor.action = new Actions(Driver.Instance);
					factor.action.moveToElement(test).build().perform();
						
					factor.string.add(test.getText());	
					factor.url.add(test.getAttribute("href"));
					test.sendKeys(factor.inNewTab);

					
				}
				
			}
		}
		
		/****************************************************************************************************
		public static class daVinciProSeries
		{
			
			public static void click()
			{
				
				factor.clear();
				
				System.out.println("start pro series--");
				
				WebDriverWait wait = new WebDriverWait(Driver.Instance, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section/div/ul/li[2]")));
				
				WebElement ele = Driver.Instance.findElement(By.xpath("//section/div/ul/li[2]/a"));
				System.out.println("ele- "+ele);
				
				//WebElement ele2 = ele.findElement(By.tagName("a"));
				factor.action = new Actions(Driver.Instance);
				factor.action.moveToElement(ele).build().perform();
				
				ele.click(); 
				
				
				java.util.List<WebElement> each = Driver.Instance.findElements(By.xpath("//li/div/a"));
				for(WebElement test: each)
				{	
					
					factor.action = new Actions(Driver.Instance);
					factor.action.moveToElement(test).build().perform();
					
					factor.string.add(test.getText());		
					factor.url.add(test.getAttribute("href"));
					test.sendKeys(factor.inNewTab);
				
				}
				
				System.out.println("string3- "+factor.string);
				System.out.println("link3- "+factor.url);
			}
		}
		**************************************************************************************************/
	}
	
	public static class RobotElement
	{
		
		public static void click()
		{
			
			factor.clear();
			
			Driver.Instance.findElement(By.xpath("//section/ul/li[4]")).click();
			
			java.util.List<WebElement> each = Driver.Instance.findElements(By.cssSelector("li.textCenter.inline-b.relative.col-4.sm-col-12.mb-col-12.ng-scope"));
			for(WebElement test: each)
			{	
				factor.string.add(test.getText());
				
				java.util.List<WebElement> printer = test.findElements(By.tagName("a"));
				for(WebElement test2: printer)
				{		
					factor.url.add(test2.getAttribute("href"));
					test2.sendKeys(factor.inNewTab);
				}
				
			}
			
		}
		
	}
}
