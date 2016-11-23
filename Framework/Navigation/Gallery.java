package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Selenium.Driver;
import Utilities.factor;

public class Gallery 
{
	
	@FindBy(how = How.XPATH, using = "//div[@class='categories float-left col-3']")
	private static WebElement galleryCategory;
	
	
	static Gallery element = PageFactory.initElements(Driver.Instance, Gallery.class);
	
	
	public void Category()
	{
		
		factor.clear();
		
		{
			java.util.List<WebElement> galleryEle = galleryCategory.findElements(By.tagName("span"));
		
			for(WebElement test:galleryEle)
			{
				String att = test.getAttribute("class");
				if(att.equals("des"))
				{
					factor.string.add(test.getText());
				}
				
			}
		}
		
		
		java.util.List<WebElement> galleryEle = galleryCategory.findElements(By.tagName("a"));
		
		for(WebElement test:galleryEle)
		{
			factor.string.add(test.getText());
			factor.url.add(test.getAttribute("href"));
			
			test.sendKeys(factor.inNewTab);
			
		}
		
	}
	
	public static void Block()
	{
		
		factor.clear();
		
		java.util.List<WebElement> galleryBlock = Driver.Instance.findElements(By.xpath("//body/div/div/div/div/div[2]/div/a"));
		for(WebElement test : galleryBlock)
		{
			factor.string.add(test.getText());
			
			factor.url.add(test.getAttribute("href"));
			test.sendKeys(factor.inNewTab);
		}
		
	}
	
	public static class CategoryElement
	{
		
		public static void click()
		{
			element.Category();
		}
		
	}
	
	public static class BlockElement
	{
		
		public static void click()
		{
			Block();
		}
	
	}

}

