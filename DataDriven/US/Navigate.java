package US;
import java.io.IOException;

import Navigation.FooterElement;
import Navigation.HeaderElement;
import Utilities.ExtentReport;
import Utilities.DataProvider;


public class Navigate 
{	
	public static class Header
	{	
		public static void isPresent() throws IOException
		{					
				ExtentReport.title("Header Element");
			
				HeaderElement.click();
			
				DataProvider.testCaseID("TC001");	
				DataProvider.Generate.ExcelFile();
				
				ExtentReport.tear();
			}	
		
		
	}
	
	
	public static class Footer
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Footer Element");
			
			FooterElement.click();
			
			DataProvider.testCaseID("TC002");
			DataProvider.Generate.ExcelFile();
				
			ExtentReport.tear();
			
		}
	}
	
	
	
}
