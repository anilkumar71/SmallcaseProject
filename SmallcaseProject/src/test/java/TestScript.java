import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BusinessFunction.AmazonTest;
import BusinessFunction.FlipkartTest;
import Library.TestCommon;
import TestBase.BaseClass;

public class TestScript extends BaseClass{
	FlipkartTest objFlipkartTest;
	AmazonTest objAmazonFunction;
	TestCommon objSmallCommon;
	
	
	public void beforeSuite()
	{
		objFlipkartTest = new FlipkartTest();
		objAmazonTest = new AmazonTest();
		objTestCommon = new TestCommon();
	}
	
	@Test(priority = 0 , description = "Validate Item Search & add to cart feature on flipkart") 
	public void firstTestCase()
	{
		objFlipkartTest.navigateToFlipkart();
		objFlipkartTest.searchProduct("Mi Smart Band 4  (Black Strap, Size : Regular)");
		float prodName = objFlipkartTest.verifyProductSelection();
		System.out.println("Product Name"+ prodName);
		Float prodPrice = objFlipkartTest.fetchProductPrice();
		System.out.println("Product Price"+prodPrice);
		objFlipkartTest.addProductToCart();
	}
	
	@Test (priority = 1 , description = "Validate Item Search & add to cart feature on flipkart & Amazon")
	public void secondTestCase()
	{
		objFlipkartTest.navigateToFlipkart();
		objFlipkartTest.searchProduct("Mi Smart Band 4  (Black Strap, Size : Regular)");
		float flipKartProductName = objFlipkartTest.verifyProductSelection();
		Float flipkartProdPrice = objFlipkartTest.fetchProductPrice();
		System.out.println("Flipkrt prod price" +flipkartProdPrice);
		
		objAmazonTest.navigateToAmazon();
		objAmazonFunction.searchProduct("Mi Smart Band 4  (Black Strap, Size : Regular)");
		objAmazonFunction.selectProd(flipKartProductName);
		Float amazonProdPrice = objAmazonFunction.FetchPrice();	
		System.out.println("Amzon Prod Price " +amazonProdPrice);
		
		objSmallCommon.comparePrices(flipkartProdPrice,amazonProdPrice);
	}
	

}