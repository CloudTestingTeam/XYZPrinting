package EN;

import java.io.IOException;

import Navigation.Help;
import Navigation.Support;
import Utilities.DataProvider;
import Utilities.ExtentReport;

public class SupportPage 
{

	public static class HelpContent
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Help Content");
			
			Help.ContentElement.click();
			
			DataProvider.testCaseID("TC012");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}	


	public static class HelpFooter
	{
		
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Quick Link");
			
			Help.FooterElement.click();
			
			DataProvider.testCaseID("TC013");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
			
		}

	
	}
	
	public static class Faq
	{
		
		public static void isPresent() throws IOException
		{
			Support.set.url();
			
			ExtentReport.title("FAQ Index Page");
			
			Support.FaqElement.Printer.click();
			
			DataProvider.testCaseID("TC014");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}
	
	public static class TutorialVideo
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Tutorial Video Index Page");
			
			Support.TutorialVideoElement.Printer.click();
			Support.TutorialVideoElement.Robot.click();
			
			DataProvider.testCaseID("TC015");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}
	
	public static class ProductWarranty
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Product Warranty Index Page");
			
			Support.ProductWarrantyElement.Printer.click();		
			Support.ProductWarrantyElement.Robot.click();
			
			DataProvider.testCaseID("TC016");		
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
		
	}
	
}
