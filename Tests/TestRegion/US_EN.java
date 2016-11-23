package TestRegion;

import java.io.IOException;

import org.testng.annotations.Test;

import US.Navigate;
import US.GalleryPage;
import US.HomePage;
import US.ProductPage;
import US.StorePage;
import US.SupportPage;
import Selenium.Driver;
import TestUtilities.XYZPrintingTest;
import Utilities.Region;
import Utilities.Region.GoTo;

public class US_EN extends XYZPrintingTest{
	
	@Test
	public void testHomePage() throws IOException
	{
		Region.US(GoTo.Home);
		
		Navigate.Header.isPresent();
		
		HomePage.SubBanner.isPresent();
		HomePage.Block.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testProductPage() throws IOException
	{
		Region.US(GoTo.Product);
		
		Navigate.Header.isPresent();
		
		ProductPage.List.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testStorePage() throws IOException
	{
		Region.US(GoTo.Store);
		
		Navigate.Header.isPresent();
		
		StorePage.XYZPrinter.Printer.isPresent();
		StorePage.XYZPrinter.Refurbish.isPresent();
		StorePage.XYZPrinter.PrintingMaterial.isPresent();
		StorePage.XYZPrinter.SpareParts.daVinci10.isPresent();
		
		StorePage.XYZPrinter.SpareParts.daVinci20Duo.isPresent();
		StorePage.XYZPrinter.SpareParts.daVinciJr10.isPresent();
		StorePage.XYZPrinter.SpareParts.Nobel10.isPresent();
		StorePage.XYZPrinter.SpareParts.daVinci10AiO.isPresent();
		StorePage.XYZPrinter.SpareParts.daVinci10Pro.isPresent();
		
		StorePage.XYZRobot.isPresent();
		StorePage.XYZWatch.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testGalleryPage() throws IOException
	{
		Region.US(GoTo.Gallery);
		
		Navigate.Header.isPresent();
		
		GalleryPage.Category.isPresent();
		GalleryPage.ImageBlock.isPresent();
		
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testSteamPage() throws IOException
	{
		Region.US(GoTo.Steam);
		
		Navigate.Header.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testNewsPage() throws IOException
	{
		Region.US(GoTo.News);
		
		Navigate.Header.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testSupportPage() throws IOException
	{
		Region.US(GoTo.Support);
		
		Navigate.Header.isPresent();
		
		SupportPage.HelpContent.isPresent();
		SupportPage.HelpFooter.isPresent();
		
		SupportPage.Faq.isPresent();
		SupportPage.TutorialVideo.isPresent();
		SupportPage.ProductWarranty.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	
}
