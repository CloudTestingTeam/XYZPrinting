package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Selenium.Driver;
import Utilities.factor;

public class FooterElement 
{
	
	@FindBy(how = How.CLASS_NAME, using = "socialMediaBtn")
	private WebElement FooterSocialMediaIcon;
	
	@FindBy(how = How.CLASS_NAME, using = "others")
	private WebElement FooterOthers;
	
	@FindBy(how = How.CLASS_NAME, using = "companyInfo")
	private WebElement FooterCompanyInfo;
	
	
	static FooterElement element = PageFactory.initElements(Driver.Instance, FooterElement.class);
	
	
	public  void select()
	{ 
		
		factor.clear();
		
		
		//icon	
		java.util.List<WebElement> SocialMediaIcon = FooterSocialMediaIcon.findElements(By.xpath("//footer/div/div/div/div"));
		for(WebElement test: SocialMediaIcon)
		{
			
			factor.icon.add(test.getAttribute("class"));
		}
		
		WebElement imgLink = FooterOthers.findElement(By.tagName("img"));		
		factor.icon.add(imgLink.getAttribute("src"));
		
		WebElement i = FooterOthers.findElement(By.xpath("//div/span"));
		factor.icon.add(i.getAttribute("class"));
		
		
		
		//social media
		java.util.List<WebElement> FooterLinkSocialMediaIcon = FooterSocialMediaIcon.findElements(By.tagName("a"));
		for(WebElement test: FooterLinkSocialMediaIcon)
		{
			try{
				factor.url.add(test.getAttribute("href"));
			}
			catch(Exception e){
				System.out.println("No social media icon");
			}
			
			test.sendKeys(factor.inNewTab);
		}
		
		
		
		//Product-StoreWatch
		java.util.List<WebElement> footerrr = Driver.Instance.findElements(By.xpath("//div[2]/div/ul/li/a"));
		for(WebElement test: footerrr)
		{
			factor.url.add(test.getAttribute("href"));
			factor.string.add(test.getText());
			test.sendKeys(factor.inNewTab);
		}
		
		
		
		//Support
		java.util.List<WebElement> foota = Driver.Instance.findElements(By.xpath("//li/ul/li/a"));
		for(WebElement test: foota)
		{
			factor.url.add(test.getAttribute("ng-href"));
			factor.string.add(test.getText());
			
			if(test.getAttribute("ng-href").isEmpty())
			{
				break;
				
			}else
				test.sendKeys(factor.inNewTab);
		}
	
		
		
		//others
		java.util.List<WebElement> iba = FooterOthers.findElements(By.tagName("a"));
		for(WebElement test: iba)
		{
			factor.url.add(test.getAttribute("href"));
			factor.string.add(test.getText());
			test.sendKeys(factor.inNewTab);
		}
		
		
		
		//company info
		java.util.List<WebElement> FooterLinkCompanyInfo = FooterCompanyInfo.findElements(By.tagName("a"));
		for(WebElement test: FooterLinkCompanyInfo)
		{	
			try{
				factor.url.add(test.getAttribute("href"));
				factor.string.add(test.getText());
			}
			catch(Exception e){
				System.out.println("No Menu");
			}
			
			test.sendKeys(factor.inNewTab);
		}
		
		
		
		WebElement ele = Driver.Instance.findElement(By.className("copyRight"));
		factor.string.add(ele.getText());
		
	}
	
	
	public static void click()
	{
		element.select();
				
	}
}
