package Library;

import java.util.ArrayList;

import TestBase.BaseClass;

public class TestCommon extends BaseClass{
	    
	    
	    public void comparePrices(float flipkartPrice,float amazonPrice)
	    {
	    	if(flipkartPrice > amazonPrice)
	    	{
	    		System.out.println("Product is cheaper on Amazon");
	    	}
	    	else if(amazonPrice > flipkartPrice)
	    	{
	    		System.out.println("Product is cheaper on Flipkart");
	    	}
	    	
	    }
	    
	    
}
