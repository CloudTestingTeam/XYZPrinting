package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import Selenium.Driver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	 	
	private static ExtentReports extent; 
	private static ExtentTest report;
	
	public static ExtentReports Instance()
	{
			
		ExtentReports extent;
		String Path = "./ExtentReport.html";
		System.out.println(Path);
		extent = new ExtentReports(Path, true);

		return extent;
			
	}
	
	public static void start()
	{
		extent = Instance();
		
	}
	
	
	public static void title(String title)
	{
		
		report = extent.startTest("Verify "+title, Region.isAt+" "+Region.pageIsAt+" Page");
		
	}
	
	
	public static ExtentTest log(String status, String step, String result)
	{
		
		if(status == "Pass")
		{
			report.log(LogStatus.PASS, step, result);
		}
		else
			report.log(LogStatus.FAIL, step, result);
		
		return report;
		
		
	}
	
	public static ExtentTest logPass(String page)
	{
		report.log(LogStatus.PASS, "Go to "+"<a href="+CheckWebsite.url+" target='_blank'>" +page+"</a>", "This site is AVAILABLE");
		return report;	
	}
	
	public static ExtentTest log404Error(String page)
	{			
		report.log(LogStatus.FAIL, "Go to "+"<a href="+CheckWebsite.url+" target='_blank'>" +page+"</a>", "404 Not Found");
		
		return report;	
	}
		
	public static ExtentTest log500Error(String page)
	{			
		report.log(LogStatus.FAIL, "Go to "+"<a href="+CheckWebsite.url+" target='_blank'>" +page+"</a>", "500 ERROR! Application Error");
		
		return report;	
	}
	
	public static ExtentTest log502Error(String page)
	{
		report.log(LogStatus.FAIL, "Go to "+"<a href="+CheckWebsite.url+" target='_blank'>" +page+"</a>", "502 Error! Proxy Error");
		return report;	
	}
	
	public static ExtentTest log503Error(String page)
	{
		report.log(LogStatus.FAIL, "Go to "+"<a href="+CheckWebsite.url+" target='_blank'>" +page+"</a>", "503 Error! Service Temporarily Unavailable");
		return report;	
	}
	
	public static ExtentTest screenshots()
	{
		try
		{
			generateScreenshot();
			System.out.println("Screenshot was saved!");
			
		} 
		catch (Exception e) 
		{
			System.out.println("No Screenshot found!");
		}
		
		report.log(LogStatus.INFO, "Screenshot: "+report.addScreenCapture("C:\\Users\\Pb6n0085\\Desktop\\screenshots\\"+Region.pageIsAt.replaceAll("[^\\w\\s]"," ")+".png"));
		return report;
		
	}
	
	public static void generateScreenshot() throws IOException
	{
		
		WebDriver augmentedDriver = new Augmenter().augment(Driver.Instance);
		File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Pb6n0085\\Desktop\\screenshots\\"+Region.pageIsAt.replaceAll("[^\\w\\s]"," ")+".png"));
	
		
	}
	
	public static ExtentTest NewIndexFound(ArrayList<String> newFound)
	{
			
			report.log(LogStatus.INFO, "Update the Data Provider", "A newly added element was found! - "+newFound);
			return report;
	
	}
	
	
	
	public static void tear()
	{	
		report.assignAuthor("Testing Team");
		extent.endTest(report);
		extent.flush();
	}
	
	
	public static void openReport() throws IOException
	{
		File htmlFile = new File("C:/Users/Pb6n0085/workspace/XYZPrinting/ExtentReport.html");
		Desktop.getDesktop().browse(htmlFile.toURI());
	}
	
	
}

