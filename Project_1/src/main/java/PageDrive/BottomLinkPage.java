package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.UtilityClass;


public class BottomLinkPage extends UtilityClass {
	
	WebDriver driver;

	public BottomLinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="//a[@data-lid='ft_about_corporate_information']")
	WebElement Corp;
	/*
	@FindBy(linkText="//a[@href='#'][1]")
	WebElement Cir;
	
	@FindBy(linkText="Member Offers")
	WebElement memberOffers;
	
	@FindBy(linkText="Lease to Own")
	WebElement LeaseToOwn;
	*/
	public void Login() {
		Corp.click();
	}

}
