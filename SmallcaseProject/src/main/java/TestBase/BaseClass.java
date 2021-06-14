package TestBase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	


	public BaseClass() {
		// TODO Auto-generated constructor stub
	 }
	
	@BeforeSuite
	public void initializeVar() {	
    System.setProperty("webdriver.chrome.driver","D:\\Seleniumupdate\\chromedriver_win32 (2)\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	 
	 
	 
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		Object driver;
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	
	

}
