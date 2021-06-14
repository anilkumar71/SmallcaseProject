package BusinessFunction;

import Library.TestCommon;
import TestBase.BaseClass;

public class AmazonTest extends BaseClass
{
		AmazonPages objAmazonPages;
		TestCommon objTestCommon;
		
		public AmazonTest()
		{
			objAmazonPages = new AmazonPages();
			TestCommon objTestCommon = new TestCommon();
		}
		
		public void navigateToAmazon()
		{
			driver.get("https://www.amazon.in/");
		}
		
		public void searchProduct(String ProdName)
		{
			objAmazonPages.enterProductOnSearchBox(ProdName);
			objAmazonPages.clickOnSearchIcon();
		}
		
		
		public void selectProd(float flipKartProductName)
		{
			objAmazonPages.getAllProduct(flipKartProductName);
		}
		
		public float FetchPrice()
		{
			objTestCommon.navigateAndTakeControlToNewTab(1);
			String price = objAmazonPages.fetchProductPrice();
			return 0;
			
			  
		}
		
		
		public void addToCart()
		{
			objAmazonPages.clickOnAddToCartAmazon();
			objAmazonPages.navigateToCartPage();
			objAmazonPages.getProductPriceAmazon();
		
		}
		
}
