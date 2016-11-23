package TestUtilities;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Selenium.Driver;
//import Utilities.oldExcelFile;
import Utilities.ExtentReport;


public class XYZPrintingTest {

	@BeforeClass
	public void init()
	{
		Driver.Initialize();
		
		//ExcelFile.selectExcel();
		
		ExtentReport.start();
	}
	
	
	@AfterClass
	public void close() throws IOException
	{
		
		ExtentReport.openReport();
	}
	
}
