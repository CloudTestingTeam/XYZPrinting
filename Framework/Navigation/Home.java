package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Driver;
import Utilities.Region;
import Utilities.factor;

public class Home 
{
	public static class SubBannerElement 
	{	
		
		public static void click()
		{	
			
			factor.clear();
			
			java.util.List<WebElement> link = Driver.Instance.findElements(By.xpath("//section[@id='block-primary']/div/div[2]/div/div/div/a"));
			String originalHandle = Driver.Instance.getWindowHandle();
			
			
			for(WebElement test:link)
			{	
				
				Actions action = new Actions(Driver.Instance);
				action.moveToElement(test).build().perform();
				SubBannerElement.sleep(1);
				test.click();	

				
				
				for(String handle : Driver.Instance.getWindowHandles()) 
				{	
					if (!handle.equals(originalHandle)) 
					{
						
						Driver.Instance.switchTo().window(handle);
						
						String escape = Keys.chord(Keys.ESCAPE);
						/*********************************************/
						WebDriverWait wait = new WebDriverWait(Driver.Instance, 3);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
						
						Driver.Instance.findElement(By.tagName("body")).sendKeys(escape);
						/*********************************************/
						
						factor.url.add(Driver.Instance.getCurrentUrl());
						
						Driver.Instance.close();
					}					    			
				}
				
				Driver.Instance.switchTo().window(originalHandle);   
			}
			
			
			java.util.List<WebElement> text = Driver.Instance.findElements(By.xpath("//section[@id='block-primary']/div/div[2]/div/div/div/p"));
			for(WebElement test:text)
			{
				factor.string.add(test.getText());
			}
			System.out.println(factor.string);
		}
		
		public static void sleep(int seconds) 
		{
			 try
			 {
				 Thread.sleep(seconds * 1000);
			 } 
			 catch (InterruptedException e) {

			 }
		}

	}
	
	public static class BlockElement 
	{
		
		@FindBy(how = How.ID, using = "index-gallery")
		private static WebElement galleryBlock;
		
		@FindBy(how = How.ID, using = "index-video")
		private static WebElement videoBlock;
		
		@FindBy(how = How.ID, using = "index-event")
		private static WebElement eventBlock;
		
		
		static BlockElement element = PageFactory.initElements(Driver.Instance, BlockElement.class);
		
		
		public void select()
		{
			
			factor.clear();
			
			String originalHandle = Driver.Instance.getWindowHandle();
			
			java.util.List<WebElement> gal = galleryBlock.findElements(By.tagName("p"));
			for(WebElement test:gal)
			{	
					
					factor.string.add(test.getText());
					System.out.println(factor.string);
					Actions action = new Actions(Driver.Instance);
					action.moveToElement(test).build().perform();
					this.sleep(1);
					test.click();	
					
					
					for(String handle : Driver.Instance.getWindowHandles()) 
					{	
						if (!handle.equals(originalHandle)) 
						{
						    Driver.Instance.switchTo().window(handle);
						    factor.url.add(Driver.Instance.getCurrentUrl());
						   
						    Driver.Instance.close();
						}
					}
					
					Driver.Instance.switchTo().window(originalHandle);
			}
			
			
			java.util.List<WebElement> vid = videoBlock.findElements(By.tagName("p"));
			for(WebElement test:vid)
			{
				
					factor.string.add(test.getText());
					Actions action = new Actions(Driver.Instance);
					action.moveToElement(test).build().perform();
					this.sleep(1);
					
					
					if(test.getText().equals("Other Video")||test.getText().equals("Autre vidéo")||
					test.getText().equals("Andere Video")||test.getText().equals("Otro Vídeo")||	
					test.getText().equals("Altro Video")||test.getText().equals("Другие видеоролики")||
					test.getText().equals("Mais vídeos"))													//if(test.getText().equals(factor.string.get(factor.string.size()-1)))
					{
						break;
					}else
						test.click();	
					
					
					for(String handle : Driver.Instance.getWindowHandles()) 
					{	
						if (!handle.equals(originalHandle)) 
						{
						    Driver.Instance.switchTo().window(handle);
						    if(Driver.Instance.getCurrentUrl() != null)
						    {
						    	factor.url.add(Driver.Instance.getCurrentUrl());
						    	 
						    	Driver.Instance.close();
						    }
						}
					}
					
					Driver.Instance.switchTo().window(originalHandle);
			}
			
			if(Region.isAt.equals("US_EN"))
			{
				WebElement event = eventBlock.findElement(By.tagName("p"));
				factor.string.add(event.getText());
			}
			
			System.out.println(factor.string);
		}
		
		public void sleep(int seconds) 
		{
		    try
		    {
		        Thread.sleep(seconds * 1000);
		    } 
		    catch (InterruptedException e) {

		    }
		    
		}
		
		public static void click()
		{
			element.select();
		}
		
	}


}
