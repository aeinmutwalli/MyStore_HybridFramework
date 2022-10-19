/**
 * 
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import BaseClass.BaseClass;

/**
 * @author QurratulAeinMohammad
 *
 */
public class PasswordPage extends BaseClass
{
	Action act = new Action();
	@FindBy (xpath="//a[@title=\"Back to Login\"]")
	WebElement backtoLogin;

	@FindBy (xpath="//a[@title=\"Authentication\"]")
	WebElement BacktoLogin;
	
	public PasswordPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//back to login page
	public LoginPage ValidateLoginPage()
	{
		act.click(driver, backtoLogin);
		return new LoginPage();
	}
	
	public LoginPage ValidateAuthentication()
	{
		act.click(driver, BacktoLogin);
		return new LoginPage();
	}
}
