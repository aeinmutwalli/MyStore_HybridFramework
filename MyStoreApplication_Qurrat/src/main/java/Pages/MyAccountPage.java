/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;

/**
 * @author QurratulAeinMohammad
 *
 */
public class MyAccountPage 
{
	public static WebDriver driver;
	Action act= new Action();
	Dashboard dashboard= new Dashboard();
	@FindBy (xpath="//i[@class='icon-home']")
	WebElement homeicon;
	
	@FindBy (xpath="//a[@title=\"Orders\"]")
	WebElement orderbutton;
	
	@FindBy (xpath="//a[@title=\"Credit slips\"]")
	WebElement creditbutton;
	
	@FindBy (xpath="//a[@title=\"Addresses\"]")
	WebElement addressbutton;
	
	@FindBy (xpath="//a[@title=\"Information\"]")
	WebElement myInfo;
	
	@FindBy (xpath="//a[@title=\"My wishlists\"]")
	WebElement myWishList;
	
	@FindBy (xpath="//a[@title=\"Home\"]")
	WebElement Homebutton;
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Dashboard Validate_Homebutton()
	{
		Action.click(driver, Homebutton);
		return new Dashboard();
	}
	
	public OrderHistoryPage Validate_Titlebutton()
	{
		System.out.println("Order Button");
		Action.isDisplayed(driver, orderbutton);
		Action.click(driver, orderbutton);
		return new OrderHistoryPage();
	}
	
	public CreaditPage Validate_CreditPage()
	{
		Action.click(driver, creditbutton);
		return new CreaditPage();
	}
	
	public String getCurrentUrl()
	{
		String urlname=driver.getCurrentUrl();
		return urlname;
	}
}
