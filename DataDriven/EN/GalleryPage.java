package EN;

import java.io.IOException;

import Navigation.Gallery;
import Utilities.DataProvider;
import Utilities.ExtentReport;

public class GalleryPage
{

	public static class Category
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Category");
			
			Gallery.CategoryElement.click();
			
			DataProvider.testCaseID("TC010");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
			
		}
	}
	public static class ImageBlock
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Image Block");
			
			Gallery.BlockElement.click();
			
			DataProvider.testCaseID("TC011");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
			
		}
		
	}
}
