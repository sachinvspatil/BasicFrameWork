package driverManagerFactory;

import org.openqa.selenium.remote.session.FirefoxFilter;

public class DriverFactory {
	
	public static DriverManager getDriverManager(DriverType type){
		 	
		DriverManager driverManager = null;
		switch(type) {
		case CHROME:
			driverManager=new ChromeDriverManager();
			
			break;
		case FIREFOX:
	//		driverManager=new FirefoxFilter();
			
			break;
		
		default:
	//		driverManager=new IEDriverManager();
			
			break;	
			
		}
		
		return driverManager;
	}

}
