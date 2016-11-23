package EN;

import java.io.IOException;

import Navigation.Home;
import Utilities.DataProvider;
import Utilities.ExtentReport;


public class HomePage 
{
	
	public static class SubBanner
	{
			
		public static void isPresent() throws IOException
		{
			
			ExtentReport.title("Sub Banner");
			
			Home.SubBannerElement.click();
	
			DataProvider.testCaseID("TC003");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
						
		}
	}
	
	public static class Block
	{
		public static void isPresent() throws IOException
		{
			
			ExtentReport.title("Block");
			
			Home.BlockElement.click();
		
			DataProvider.testCaseID("TC004");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
						
		}
	}
}
