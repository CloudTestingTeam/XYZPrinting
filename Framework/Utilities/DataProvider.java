package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider 
{

	private static int tsidRowNum;
	private static Sheet sheet;
	private static Workbook kaeyoh = null;
	private static String filePath = "C:\\Users\\pb6n0085\\Desktop";
	private static String fileName = "testData.xlsx";	//"XYZPrinting_TestData.xlsx";
	private static File file =    new File(filePath+"\\"+fileName);
	private static FileInputStream inputStream;
	private static ArrayList<String> element;
	private static int rowNum;

	
	public static void writeExcelSetUp() throws IOException
	{

	   inputStream = new FileInputStream(file);
	        
	   String fileExtensionName = fileName.substring(fileName.indexOf("."));

	   if(fileExtensionName.equals(".xlsx"))
	   {

	       kaeyoh = new XSSFWorkbook(inputStream);

	   }
	   else if(fileExtensionName.equals(".xls"))
	   {
		   
		   kaeyoh = new HSSFWorkbook(inputStream);

	   }

	    sheet = kaeyoh.getSheet(Region.isAt);

	}
	
	public static int getRowNum(int RowNum)
	{
		 rowNum = RowNum;
		 return rowNum;
	}
	
	 public static ArrayList<String> writeExcel(ArrayList<String> element2) throws IOException
	 {
	 
		
		 
		element = element2;
		 
		writeExcelSetUp();
	  
	    for(int j = 0; j < element.size(); j++)
		{

	    	
	    	System.out.println("Row Num: "+rowNum);
		    Cell cell = sheet.getRow(rowNum).createCell(4);
		    if(element.get(j)!= null)
		    {
		
		        cell.setCellValue(element.get(j));
		        rowNum++;        
			        
		    }
		     
		}
	   
	    inputStream.close();
	    FileOutputStream outputStream = new FileOutputStream(file);
	    kaeyoh.write(outputStream);
	    outputStream.close();
	   
	    return element;
	 }   
	 
	 
	 public static void Compare()
	{
		
		
		for(int i = 0; i < element.size(); i++)
		{
			
			String testData = sheet.getRow(tsidRowNum).getCell(3).getStringCellValue();
			String fetchedData = sheet.getRow(tsidRowNum).getCell(4).getStringCellValue();
			String Step = sheet.getRow(tsidRowNum).getCell(2).getStringCellValue();
			String Result = sheet.getRow(tsidRowNum).getCell(5).getStringCellValue();
			System.out.println(testData);
			if(Result.equals("None"))
			{
				
			}
			else
			{
				if(testData.equals(fetchedData))
				{
					System.out.println("pak ganern!!!");
					if(Step != "-")
					{
						ExtentReport.log("Pass", Step, Result);
					}
					
				}
				else
				{
					//ExtentReport.log("FAIL", Step, "");
					ExtentReport.log("FAIL", Step, fetchedData+"<font color ='red'> should be </font> "+testData);
				}
			}
			
			
				
			DataProvider.tsidRowNum++;
		
			
		}
			
	}
	 
	 public static int getTSID(int num)
	 {
		 tsidRowNum = num;
		 return tsidRowNum;
	 }
	 
	public static void testCaseID(String tcid) throws IOException
	{
		 writeExcelSetUp();
		 System.out.println("LAST ROW NUM- "+sheet.getLastRowNum());
		    for(int i = 2; i < sheet.getLastRowNum(); i++)
		    {
		    	String tcid2 = sheet.getRow(i).getCell(0).getStringCellValue();
		    	System.out.println("TCNum- "+tcid2);
		    	
		    	if(tcid.equals(tcid2))
		    	{
		    		getTSID(i);
		    		getRowNum(i);
		    		break;
		    	}
		    }
	
	}
	

	public static class Generate
	{
		public static void ExcelFile() throws IOException
		{
			writeExcel(factor.icon);
			Compare();
			
			writeExcel(factor.string);
			Compare();
			
			writeExcel(factor.url);	
			Compare();
		}
	}
	
}
