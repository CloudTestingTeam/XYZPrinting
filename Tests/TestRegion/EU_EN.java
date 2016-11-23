package TestRegion;
import java.io.IOException;

import org.testng.annotations.Test;

import EN.GalleryPage;
import EN.HomePage;
import EN.Navigate;
import EN.ProductPage;
import EN.SupportPage;
import EN.eShopPage;
import TestUtilities.XYZPrintingTest;
import Utilities.Region;
import Utilities.Region.GoTo;


public class EU_EN extends XYZPrintingTest
{

	
	public void testHomePage() throws IOException
	{
		Region.EU_EN(GoTo.Home);
		
		Navigate.Header.isPresent();
		//error in <p> tag!!!!---already fixed HAHA walang gallery block si EU :D
		HomePage.SubBanner.isPresent();
		HomePage.Block.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	
	public void testStorePage() throws IOException
	{
		Region.EU_EN(GoTo.Store);
		
		//Navigate.Header.isPresent();
		
		eShopPage.Index.isPresent();
		eShopPage.Printer.isPresent();
		eShopPage.PrintingMaterial.isPresent();
		eShopPage.SpareParts.daVinciJrSeries.isPresent();
		//eShopPage.SpareParts.daVinciProSeries.isPresent(); --there's a problem
		eShopPage.Robot.isPresent();
		
		
		//Navigate.Footer.isPresent();
		
	}
	
	public void testGalleryPage() throws IOException
	{
		Region.EU_EN(GoTo.Gallery);
		
		//Navigate.Header.isPresent();
		
		//No test data yet
		GalleryPage.Category.isPresent();
		GalleryPage.ImageBlock.isPresent();
				
		//Navigate.Footer.isPresent();
		
	}
	
	public void testNewsPage() throws IOException
	{
		Region.EU_EN(GoTo.News);
		
		Navigate.Header.isPresent();
		
		Navigate.Footer.isPresent();
		
	}
	//@Test
	public void testSupportPage() throws IOException
	{
		Region.EU_EN(GoTo.Support);
		
		//Navigate.Header.isPresent();
		SupportPage.HelpContent.isPresent();
		//SupportPage.HelpFooter.isPresent();
		
		
		//-MAY PROB DITO-IBA ANG PATH NG EU
		//SupportPage.Faq.isPresent();
		//SupportPage.TutorialVideo.isPresent();
		//SupportPage.ProductWarranty.isPresent();
		
		//Navigate.Footer.isPresent();
		
	}
	
	@Test
	public void testProductPage() throws IOException
	{
		Region.EU_EN(GoTo.Product);
		
		//Navigate.Header.isPresent();
		
		//No test data yet
		ProductPage.List.isPresent();
		
		//Navigate.Footer.isPresent();
		
	}
	

}

