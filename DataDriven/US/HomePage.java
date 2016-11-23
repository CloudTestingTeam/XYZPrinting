package US;

import java.io.IOException;

import Navigation.Home;
import Utilities.ExtentReport;
import Utilities.DataProvider;

public class HomePage {

	public static class SubBanner
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Sub Banner Element");
			
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
			ExtentReport.title("Block Element");
			
			Home.BlockElement.click();
			
			DataProvider.testCaseID("TC004");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
}
