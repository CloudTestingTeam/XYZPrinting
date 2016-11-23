package Utilities;
import Selenium.Driver;

public class Region {
	
	public static String pageIsAt;
	public static String isAt;
	
	public static void Region(String region)
	{
		isAt = region;
		
	}
	
	public static void Page(String page)
	{
		pageIsAt = page;
	}

	public static void US(GoTo page)
	{
		Region("US_EN");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://us.xyzprinting.com/"); 	
				break;
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://us.xyzprinting.com/us_en/product"); 	
				break;
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://us.store.xyzprinting.com/"); 	
				break;
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://us.gallery.xyzprinting.com/"); 
				break;
			case Steam: 
				pageIsAt ="K-12 STEAM";
				CheckWebsite.Status("http://us.xyzprinting.com/steam"); 		
				break;
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://us.xyzprinting.com/us_en/News"); 	
				break;
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/us_en/Help"); 	
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	
	}
	
	public static void EU_EN(GoTo page)
	{
		Region("EU_EN");
		
		switch(page)
		{
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_en/Home"); 
				break;
			case Store:
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_en/indexEshop"); 
				break;
			case Gallery:
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=null&"); 
				break;
			case News:
				pageIsAt ="News";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_en/News"); 
				break;
			case Support:
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_en/Help");
				break;
			case Product:
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_en/product?cl=null&"); 
				break;
			default:;
			
			Page(pageIsAt);
		}
	}
	
	public static void EU_FR(GoTo page)
	{
		Region("EU_FR");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_fr/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_fr/product?cl=null&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_fr/indexEshop"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_fr/News?cl=true&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_fr/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_DE(GoTo page)
	{
		Region("EU_DE");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_de/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_de/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_de/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_de/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_de/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_NL(GoTo page)
	{
		Region("EU_NL");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_nl/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_nl/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_nl/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_nl/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_nl/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_ES(GoTo page)
	{
		Region("EU_ES");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_es/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_es/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_es/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_es/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_es/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_IT(GoTo page)
	{
		Region("EU_IT");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_it/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_it/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_it/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_it/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_it/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_RU(GoTo page)
	{
		Region("EU_RU");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_ru/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_ru/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_ru/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_ru/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_ru/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void EU_PT(GoTo page)
	{
		Region("EU_PT");
		
		switch(page)
		{
			
			case Home: 
				pageIsAt ="Home";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_pt/Home"); 
				break;
				
			case Product: 
				pageIsAt ="Product";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_pt/product?cl=true&"); 
				break;
				
			case Store: 
				pageIsAt ="Store";
				CheckWebsite.Status("http://eu.xyzprinting.com/eu_pt/indexEshop?cl=true&"); 
				break;
				
			case Gallery: 
				pageIsAt ="3D Gallery";
				CheckWebsite.Status("http://eu.gallery.xyzprinting.com/?cl=true&"); 
				break;
				
			case News: 
				pageIsAt ="News";
				CheckWebsite.Status("http://www.xyzprinting.com/eu_pt/News?cl=null&"); 
				break;
				
			case Support: 
				pageIsAt ="Support";
				CheckWebsite.Status("http://support.xyzprinting.com/eu_pt/Help?cl=true&"); 
				break;
				
			default:;
			
			Page(pageIsAt);
			
		}
		
	}
	
	public static void CN(GoTo page)
	{
		switch(page)
		{
			case Home: 
				Driver.Instance.get("http://www.xyzprinting.cn/"); 
				break;
			default:;
			
		}
	}
	
	public static void TW(GoTo page)
	{
		
		switch(page)
		{
		
			case Home: 
				Driver.Instance.get("http://tw.xyzprinting.com/"); 
				break;
			default:;
			
		}
	}
	
	public static enum GoTo
	{
		
			Home , Product, Gallery, Steam, Store, News, Support
		
	
	}
	
	
}

