package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Selenium.Driver;
import Utilities.factor;

public class ProductElement 
{
	
	public static void click()
	{	
		
		factor.clear();
		
		java.util.List<WebElement> productlist = Driver.Instance.findElements(By.cssSelector("li.textCenter.list-lo-3.relative.ng-scope"));
		
		for(WebElement g: productlist)
		{
			
				java.util.List<WebElement> j = g.findElements(By.tagName("h2"));
				
				for(WebElement test: j)
				{
					
						factor.string.add(test.getText());
				
				}
			
			
				java.util.List<WebElement> f = g.findElements(By.tagName("a"));
				
				for(WebElement test: f)
				{
					
					if(null == test.getAttribute("href"))
					{
						break;
					}
					
					factor.string.add(test.getText());
					factor.url.add(test.getAttribute("href"));
					
					test.sendKeys(factor.inNewTab);
					
				}		
			
		}
	
	}

}
