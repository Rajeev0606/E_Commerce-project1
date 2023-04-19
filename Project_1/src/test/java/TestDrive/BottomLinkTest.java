package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.BottomLinkPage;
import PageDrive.HomePage;

public class BottomLinkTest extends BaseClass {
	
	@Test
	public void Bottomlink1() {
		
		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));
		
		BottomLinkPage bottom = new BottomLinkPage(driver);
		bottom.Login();
	}

}
