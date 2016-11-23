package US;

import java.io.IOException;

import Navigation.Gallery;
import Utilities.ExtentReport;
import Utilities.DataProvider;


public class GalleryPage
{	
	
	public static class Category
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Category Element");
			
			Gallery.CategoryElement.click();
			
			DataProvider.testCaseID("TC017");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
	public static class ImageBlock
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Image Block Element");
			
			Gallery.BlockElement.click();
			
			DataProvider.testCaseID("TC018");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}

}
