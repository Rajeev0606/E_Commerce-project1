package BaseDrive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends UtilityClass {
	@BeforeMethod
	public void Startup() throws Exception {
		
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void Closeup() throws Exception {
		Thread.sleep(8000);
			driver.quit();
		}
	

}
