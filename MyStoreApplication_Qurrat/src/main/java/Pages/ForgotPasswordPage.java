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
public class ForgotPasswordPage extends BaseClass
{
	Action act= new Action();
	@FindBy (xpath="//input[@id=\"email\"]")
	WebElement email;
	
	@FindBy (xpath="//button[@name=\"submit_search\"]")
	WebElement submitButton;
	
	@FindBy (xpath="//a[@title=\"Back to Login\"]")
	WebElement backtoHome;
		
	@FindBy (xpath="//a[@title=\"Recover your forgotten password\"]")
	WebElement forgotpassword;
	
	public ForgotPasswordPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Forgot password
		public ForgotPasswordPage validateForgotPasswordbutton()
		{
			act.click(driver, forgotpassword);
			return new ForgotPasswordPage();
		}
	
	//Forgot password
	public PasswordPage ValidateForgotPassword(String Email)
	{
		act.type(email, Email);
		//Action.click(driver, submitButton);
		act.click(driver, backtoHome);
		return new PasswordPage();
	}
}
