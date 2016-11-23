package US;

import java.io.IOException;

import Navigation.Help;
import Navigation.Support;
import Utilities.ExtentReport;
import Utilities.DataProvider;


public class SupportPage {
	
	
	public static class HelpContent
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Help Content Element");
			
			Help.ContentElement.click();
			
			DataProvider.testCaseID("TC019");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}	


	public static class HelpFooter
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Quick Link Element");
			
			Help.FooterElement.click();
			
			DataProvider.testCaseID("TC020");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
			
		}

	
	}
	
	public static class Faq
	{
		
		public static void isPresent() throws IOException
		{
			Support.set.url();
			
			ExtentReport.title("FAQ Index Page Element");
			
			Support.FaqElement.Printer.click();

			DataProvider.testCaseID("TC021");	
			DataProvider.Generate.ExcelFile();
			
			
			Support.FaqElement.Robot.click();
			
			DataProvider.testCaseID("TC022");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
			
		}
		
	}
	
	public static class TutorialVideo
	{
		public static void isPresent() throws IOException
		{
			Support.set.url();
			
			ExtentReport.title("Tutorial Video Index Page Element");
			
			Support.TutorialVideoElement.Printer.click();

			DataProvider.testCaseID("TC023");	
			DataProvider.Generate.ExcelFile();
			
			
			
			
			Support.TutorialVideoElement.Robot.click();
			
			DataProvider.testCaseID("TC024");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}
	
	public static class ProductWarranty
	{
		public static void isPresent() throws IOException
		{
			Support.set.url();
			
			ExtentReport.title("Product Warranty Index Page Element");
			
			Support.ProductWarrantyElement.Printer.click();
			
			DataProvider.testCaseID("TC025");	
			DataProvider.Generate.ExcelFile();
			
			
			
			
			Support.ProductWarrantyElement.Robot.click();
			
			DataProvider.testCaseID("TC026");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}
	
}
