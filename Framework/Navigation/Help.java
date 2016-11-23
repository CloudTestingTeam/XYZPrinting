package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selenium.Driver;
import Utilities.factor;


public class Help 
{
	
	public static class ContentElement
	{
		
		public static void click ()
		{
			
			factor.clear();
			
			
			WebElement brdcrumb = Driver.Instance.findElement(By.xpath("//body/div/div/div/div/ul/li"));
			factor.string.add(brdcrumb.getText());
			
			
			WebElement h1 = Driver.Instance.findElement(By.xpath("//h1"));
			factor.string.add(h1.getText());
				
			
			java.util.List<WebElement> con1 = Driver.Instance.findElements(By.cssSelector("ul.main_item.row-3"));
			for(WebElement test: con1 )
			{
				java.util.List<WebElement> con2 = test.findElements(By.tagName("li"));
				for(WebElement test2: con2 )
				{
					factor.icon.add(test2.getCssValue("background-image"));
							
					java.util.List<WebElement> con3 = test2.findElements(By.tagName("a"));
					for(WebElement test3: con3 )
					{
						factor.url.add(test3.getAttribute("href"));
						factor.string.add(test3.getText());
						test3.sendKeys(factor.inNewTab);
					}
						
				}
				
			}
			
		}
	}
	
	public static class FooterElement
	{
		
		public static void click()
		{
			
			factor.clear();
			
			
			WebElement h5 = Driver.Instance.findElement(By.xpath("//h5"));
			factor.string.add(h5.getText());
				
			
			java.util.List<WebElement> con = Driver.Instance.findElements(By.cssSelector("ul.nav-bottom"));
			for(WebElement test: con )
			{
				java.util.List<WebElement> con2 = test.findElements(By.tagName("li"));
				for(WebElement test2: con2 )
				{
					
					java.util.List<WebElement> con3 = test2.findElements(By.tagName("a"));
					for(WebElement test3: con3 )
					{
						factor.url.add(test3.getAttribute("href"));
						factor.string.add(test3.getText());
						test3.sendKeys(factor.inNewTab);
					}
					
					
				}
			}
		
		}
	}
		
}
