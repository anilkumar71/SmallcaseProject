package BusinessFunction;

import Library.TestCommon;
import TestBase.BaseClass;

public class FlipkartTest extends BaseClass {
	
	FlipkartTest objFlipkartPages;
	TestCommon objTestCommon;
	
	public FlipkartTest()
	{
		objFlipkartPages = new FlipkartTest();
		objTestCommon = new TestCommon();
		
	}

	public void navigateToFlipkart()
	{
		driver.get("https://www.flipkart.com/");
		
	}
	
	public void searchProduct(String productName)
	{
		objFlipkartPages.clickingonSearchBar(productName);
		objFlipkartPages.clickOnSearchButton();
		objFlipkartPages.ClickingOnFirstProduct();
	}
	
	private void ClickingOnFirstProduct() {
		// TODO Auto-generated method stub
		
	}

	private void clickOnSearchButton() {
		// TODO Auto-generated method stub
		
	}

	private void clickingonSearchBar(String productName) {
		// TODO Auto-generated method stub
		
	}

	public float verifyProductSelection() {
		objTestCommon.navigateAndTakeControlToNewTab(0);
		
		float prodNameString = objFlipkartPages.fetchProductPrice();
		return prodNameString;	
	}
	
	
	public float fetchProductPrice()
	{
		float prodPrice = objFlipkartPages.fetchProductPrice();
		return prodPrice;
		
		
	}
	
	public void addProductToCart()
	{	
		objFlipkartPages.clickingOnAddToCartButton();
		objFlipkartPages.increasingQuantity();
		String finalPrice = objFlipkartPages.getCartPrice();
		
		
	}

	private String getCartPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	private void increasingQuantity() {
		// TODO Auto-generated method stub
		
	}

	private void clickingOnAddToCartButton() {
		// TODO Auto-generated method stub
		
	}
	
}