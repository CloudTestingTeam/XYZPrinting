package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Driver;
import Utilities.factor;


public class HeaderElement 
{
	
	@FindBy(how = How.CLASS_NAME, using = "logo")
	private WebElement logo;
	
	@FindBy(how = How.CLASS_NAME, using = "main-menu")
	private WebElement tab;
	
	@FindBy(how = How.CLASS_NAME, using = "ctrlZone")
	private WebElement socialMediaIcon;
	
	@FindBy(how = How.XPATH, using = "//div[@class='xyzFamily notHover']")
	private WebElement xyzFamilyIconHover;
	
	@FindBy(how = How.CLASS_NAME, using = "beta-mark")
	private WebElement beta;
	
	@FindBy(how = How.CSS, using = "header .memberZone .xyzFamily .familyMenu")
	private WebElement xyzFamilyIcon;
	
	
	static HeaderElement element = PageFactory.initElements(Driver.Instance, HeaderElement.class);
	
	
	public  void select()
	{ 	
		
		factor.clear();
		
		WebElement logoLink = logo.findElement(By.tagName("a"));
		factor.url.add(logoLink.getAttribute("href"));
		factor.string.add(logoLink.getText());
		logoLink.sendKeys(factor.inNewTab);
		
		
		WebElement XYZlogo = logo.findElement(By.tagName("img"));
		factor.icon.add(XYZlogo.getAttribute("src"));
		
		
		java.util.List<WebElement> HeaderLinkTab = tab.findElements(By.tagName("a"));
		for(WebElement test: HeaderLinkTab)
		{	
			try
			{
				factor.url.add(test.getAttribute("href"));
				factor.string.add(test.getText());
				
				if(test.getText().equals("K-12 STEAM"))
				{
					factor.string.add(beta.getText());
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Error occured");
			}
			
			test.sendKeys(factor.inNewTab);
		}
		
		
		java.util.List<WebElement> HeaderLinkSocialMediaIcon = socialMediaIcon.findElements(By.tagName("a"));
		for(WebElement test: HeaderLinkSocialMediaIcon)
		{
			try
			{
				factor.url.add(test.getAttribute("href"));
				
			}
			catch(Exception e)
			{
				System.out.println("No social media icon");
			}
			
			test.sendKeys(factor.inNewTab);
		}
		
		
		
		for(int i = 2; i<=4; i++)
		{
			
			
			WebDriverWait wait = new WebDriverWait(Driver.Instance, 900);
			factor.action = new Actions(Driver.Instance);
			factor.action.moveToElement(xyzFamilyIconHover).build().perform();	 
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div["+i+"]/a")));
			
			if(i == 2)
			{
				WebElement fam = Driver.Instance.findElement(By.xpath("//div[2]/div[2]/div"));
				factor.string.add(fam.getText());

			}
			
			
			factor.url.add(ele.getAttribute("href"));
			factor.string.add(ele.getText());
		
			ele.sendKeys(factor.inNewTab);
			
		}
		
		
		java.util.List<WebElement> iCon = socialMediaIcon.findElements(By.xpath("ul/li"));
		for(WebElement test: iCon)
		{
			factor.icon.add(test.getAttribute("class"));
				
		}
		
		
		factor.icon.add(xyzFamilyIcon.getCssValue("background-image"));
		
		
		java.util.List<WebElement> hoverList = xyzFamilyIconHover.findElements(By.tagName("span"));
		for(WebElement test: hoverList)
		{
			factor.icon.add(test.getAttribute("class"));
			
		}
		
		
		WebElement logIn = Driver.Instance.findElement(By.xpath("//div[@class='sign-guest ng-scope']"));
		WebElement ele = logIn.findElement(By.tagName("a"));
		
		factor.string.add(ele.getText());
		ele.sendKeys(factor.inNewTab);
		factor.url.add(Driver.Instance.getCurrentUrl());
		
	}
	
	
	public static void click()
	{
		String originalHandle = Driver.Instance.getCurrentUrl();
		element.select();
		
		Driver.restart();
		
		Driver.Instance.get(originalHandle); 
	
	}
	
}
