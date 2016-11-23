package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Driver;
import Utilities.factor;

public class Store {
	
	public static class XYZPrinter
	{
		
		public static class PrinterElement
		{
			
			public static void click()
			{
				Generate.XYZPrinter();
			
			}
		}
			
		
		public static class RefurbishElement
		{
			
			public static void click()
			{
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='sub-nav']/label[2]"));
				ele.click();
				
				Generate.XYZPrinter();
			
			}
		}
		
		
		public static class PrintingMaterialElement
		{
			
			public static void click()
			{
				WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='sub-nav']/label[3]"));
				ele.click(); 
				
				Generate.XYZPrinter();
			
			}
		}
		
		
		public static class SparePartsElement
		{
			
			public static class daVinci10
			{
				
				public static void click()
				{
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='sub-nav']/label[4]"));
					ele.click();
					
					Generate.XYZPrinter.SparePartElement();								
				}
			}
			public static class daVinciw20Duo
			{
				
				public static void click()
				{
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='spare-parts-nav']/label[2]"));
					ele.click();
					
					Generate.XYZPrinter.SparePartElement();

				}
			}
			public static class daVinciJr10
			{
				
				public static void click()
				{				
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='spare-parts-nav']/label[3]"));
					ele.click();
					
					Generate.XYZPrinter.SparePartElement();
				}
			}
			public static class Nobel10
			{
			
				public static void click()
				{			
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='spare-parts-nav']/label[4]"));
					ele.click();			
					
					Generate.XYZPrinter.SparePartElement();
				}
			}
			public static class daVinci10AiO
			{
				
				public static void click()
				{				
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='spare-parts-nav']/label[5]"));
					ele.click();				
					
					Generate.XYZPrinter.SparePartElement();
				}
			}
			public static class daVinci10Pro
			{
				public static void click()
				{				
					WebElement ele = Driver.Instance.findElement(By.xpath("//div[@id='spare-parts-nav']/label[6]"));
					ele.click();			
					
					Generate.XYZPrinter.SparePartElement();
				}
			}
		}
		
	}
	public static class Generate
	{
		
		public static void XYZPrinter()
		{
			factor.clear();
			
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
		
		public static class XYZPrinter
		{
			
			public static void SparePartElement()
			{	
				factor.clear();
				WebDriverWait wait = new WebDriverWait(Driver.Instance, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.textCenter.inline-b.relative.col-4.sm-col-12.mb-col-12.ng-scope")));
				java.util.List<WebElement> each = Driver.Instance.findElements(By.cssSelector("li.textCenter.inline-b.relative.col-4.sm-col-12.mb-col-12.ng-scope"));
				
				for(WebElement test: each)
				{	
					factor.string.add(test.getText());	
				}
			}
		}
		
	}
	
	
	public static class XYZRobot 
	{
		
		public static void click()
		{
			WebElement ele = Driver.Instance.findElement(By.xpath("//section/ul/li[2]"));
			ele.click(); 
			Generate.XYZPrinter();
			
		}
	}
	
	
	
	public static class XYZWatch 
	{
		
		public static void click()
		{
			WebElement ele = Driver.Instance.findElement(By.xpath("//section/ul/li[3]"));
			ele.click();
			Generate.XYZPrinter();
			
		}
	}
}
