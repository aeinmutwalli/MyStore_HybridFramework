package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import BaseClass.BaseClass;

public class Dashboard extends BaseClass
{
	Action act= new Action();
	@FindBy (xpath="//a[@title=\"Log in to your customer account\"]")
	WebElement signin;
	
	@FindBy (xpath="//a[@title=\"Contact Us\"]")
	WebElement contactUs;
	
	@FindBy (xpath="//img[@class=\"img-responsive\"]")
	WebElement logo;
	
	@FindBy (xpath="//input[@id=\"search_query_top\"]")
	WebElement searchbox;
	
	@FindBy (xpath="//button[@name=\"submit_search\"]")
	WebElement searchbutton;
	
	public Dashboard ()
	{
		PageFactory.initElements(driver, this);
	}
	//Logo
	public boolean validateLogo()
	{
		System.out.println("Verified Logo");
		return Action.isDisplayed(driver, logo);
	}
	//Search box 
	public SearchResultPage SearchProduct(String ProductName)
	{
		System.out.println("Searching the Product");
		act.type(searchbox, ProductName);
		act.click(driver, searchbox);
		return new SearchResultPage();
	}
	//Sign in 
		public LoginPage ClickonSignin()
		{
			System.out.println("Clicked on Sign in Button");
			Action.click(driver, signin);
			return new LoginPage();
		}
	/*Contact Us 
	public ContactUsPage ClickonContactUs()
	{
		act.click(driver, contactUs);
		return new ContactUsPage();
	}
	*/
}
