package driverManagerFactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Tests {
	DriverManager driverManager;
	WebDriver driver;
	
	@Test
	public static void main(String[] args) {
		
		Tests test=new Tests();
		test.navigateToGoogleTest();
	}
	
	public void navigateToGoogleTest() {
		

		System.setProperty("webdriver.chrome.driver", "F:\\Test\\chromedriver.exe");
		
		driverManager = DriverFactory.getDriverManager(DriverType.CHROME);
		
		driver=driverManager.getWebDriver();
		driver.get("https://www.google.com/");
		
		//Assert.assertEquals("Google",driver.getTitle());
		
		System.out.println(driver.getTitle());
		driverManager.quiteWebDriver();
	}
	
}
