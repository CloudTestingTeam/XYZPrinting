package US;

import java.io.IOException;


import Navigation.Store;
import Utilities.ExtentReport;
import Utilities.DataProvider;


public class StorePage {

	public static class XYZPrinter
	{		
		public static class Printer
		{		
			public static void isPresent() throws IOException
			{
				ExtentReport.title("Each 3D Printer Element");
				
				Store.XYZPrinter.PrinterElement.click();
				
				DataProvider.testCaseID("TC006");	
				DataProvider.Generate.ExcelFile();
				
				ExtentReport.tear();
			}
			
		}
		public static class Refurbish
		{
		
			public static void isPresent() throws IOException
			{
				ExtentReport.title("Each 3D Refurbish Element");
				
				Store.XYZPrinter.RefurbishElement.click();
				
				DataProvider.testCaseID("TC007");	
				DataProvider.Generate.ExcelFile();
				
				ExtentReport.tear();
			}
			
		}
		public static class PrintingMaterial
		{
			
			public static void isPresent() throws IOException
			{
				ExtentReport.title("Each Printing Material Element");
				
				Store.XYZPrinter.PrintingMaterialElement.click();
				
				DataProvider.testCaseID("TC008");	
				DataProvider.Generate.ExcelFile();
				
				ExtentReport.tear();
			}
			
		}
		public static class SpareParts
		{
			
			public static class daVinci10
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each da Vinci 1.0 Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.daVinci10.click();
					
					DataProvider.testCaseID("TC009");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			public static class daVinci20Duo
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each da Vinci 2.0 Duo Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.daVinciw20Duo.click();
					
					DataProvider.testCaseID("TC010");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			public static class daVinciJr10
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each da Vinci Jr. 1.0 Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.daVinciJr10.click();
					
					DataProvider.testCaseID("TC011");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			public static class Nobel10
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each Nobel 1.0 Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.Nobel10.click();
					
					DataProvider.testCaseID("TC012");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			public static class daVinci10AiO
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each da Vinci 1.0 AiO Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.daVinci10AiO.click();
					
					DataProvider.testCaseID("TC013");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			public static class daVinci10Pro
			{
				
				public static void isPresent() throws IOException
				{
					ExtentReport.title("Each da Vinci 1.0 Pro Spare Parts Element");
					
					Store.XYZPrinter.SparePartsElement.daVinci10Pro.click();
					
					DataProvider.testCaseID("TC014");	
					DataProvider.Generate.ExcelFile();
					
					ExtentReport.tear();
				}
				
			}
			
		}
	}


	public static class XYZRobot 
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Each XYZ Robot Element");
			
			Store.XYZRobot.click();
			
			DataProvider.testCaseID("TC015");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
	
	
	public static class XYZWatch 
	{
		public static void isPresent() throws IOException
		{
			ExtentReport.title("Each XYZ Watch Element");
			
			Store.XYZWatch.click();
			
			DataProvider.testCaseID("TC016");	
			DataProvider.Generate.ExcelFile();
			
			ExtentReport.tear();
		}
	}
}
