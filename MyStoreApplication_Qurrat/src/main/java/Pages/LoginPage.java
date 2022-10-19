package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import BaseClass.BaseClass;

public class LoginPage extends BaseClass
{
	Action act= new Action();
	
	@FindBy (xpath="//input[@id=\"email\"]")
	WebElement email;
	
	@FindBy (xpath="//input[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy (xpath="//button[@id=\"SubmitLogin\"]")
	WebElement submitbutton;
	
	@FindBy (xpath="//input[@id=\"email_create\"]")
	WebElement emailcreate;
	
	@FindBy (xpath="//button[@id=\"SubmitCreate\"]/span")
	WebElement createbutton;
	
	@FindBy (xpath="//a[@title=\"Recover your forgotten password\"]")
	WebElement forgotpassword;
	
	@FindBy (xpath="//i[@class=\"icon-home\"]")
	WebElement Home;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Sign in 
	public MyAccountPage sign(String username, String pwd)
	{
		System.out.println("Entered Email ID and Password");
		act.type(email, username);
		act.type(password, pwd);
		act.click(driver, submitbutton);
		return new MyAccountPage();
	}
	//Registration 
	public RegistrationPage createNewAccount(String createemail) throws InterruptedException
	{
		act.type(emailcreate, createemail);
		Thread.sleep(2000);
		act.click(driver, createbutton);
		return new RegistrationPage();
	}
	//Forgot password
	public ForgotPasswordPage validateForgotPassword()
	{
		act.click(driver, forgotpassword);
		return new ForgotPasswordPage();
	}
	public Dashboard ValidateHome()
	{
		act.click(driver, Home);
		return new Dashboard();
	}
}
