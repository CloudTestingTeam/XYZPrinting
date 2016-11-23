package US;

import java.io.IOException;

import Navigation.ProductElement;
import Utilities.ExtentReport;
import Utilities.DataProvider;


public class ProductPage {

	public static class List
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("each Product Element");
			
			ProductElement.click();
			
			DataProvider.testCaseID("TC005");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
}
