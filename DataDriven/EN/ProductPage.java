package EN;

import java.io.IOException;

import Navigation.ProductElement;
import Utilities.DataProvider;
import Utilities.ExtentReport;

public class ProductPage {

	public static class List
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Each Product Element");
			
			ProductElement.click();
			
			DataProvider.testCaseID("TC017");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
}