package EN;

import java.io.IOException;

import Navigation.eShop;
import Utilities.DataProvider;
import Utilities.ExtentReport;

public class eShopPage {

	public static class Index
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Eshop Index");
		
			eShop.IndexElement.click();
			
			DataProvider.testCaseID("TC005");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
	
	
	
	public static class Printer
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Eshop 3D Printer");
			
			eShop.PrinterElement.click();
			
			DataProvider.testCaseID("TC006");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
	
	public static class PrintingMaterial
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Eshop Printing Material");
			
			eShop.PrintingMaterialElement.click();
			
			DataProvider.testCaseID("TC007");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
	
	public static class SpareParts
	{
		public static class daVinciJrSeries
		{
			public static void isPresent() throws IOException
			{
				ExtentReport.title("Eshop Spare Parts - da Vinci Jr Series");
				
				eShop.SparePartsElement.daVinciJrSeries.click();
				
				DataProvider.testCaseID("TC008");	
				DataProvider.Generate.ExcelFile();
				
				ExtentReport.tear();
			}
		}
		
		/*public static class daVinciProSeries
		{
			public static void isPresent()
			{
				ExtentReport.title("Eshop Spare Parts - da Vinci Pro Series");
				
				//eShop.SparePartsElement.daVinciProSeries.click();
			}
		}*/
		
	}
	
	public static class Robot
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Eshop Robot");
			
			eShop.RobotElement.click();
			
			DataProvider.testCaseID("TC009");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
}
