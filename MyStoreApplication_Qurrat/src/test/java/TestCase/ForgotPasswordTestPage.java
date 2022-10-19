/**
 * 
 */
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.Dashboard;
import Pages.ForgotPasswordPage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.PasswordPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class ForgotPasswordTestPage extends BaseClass
{
	Dashboard dashboard;
	LoginPage loginpage;
	ForgotPasswordPage forgotpasswordpage;
	PasswordPage passwordpage;
	MyAccountPage myaccountpage;
	
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test 
	public void VerifyForgotPasswordTest() throws Throwable
	{
		dashboard = new Dashboard();
		loginpage = new LoginPage();
		forgotpasswordpage = new ForgotPasswordPage();
		System.out.println("Verifying Forgot Page");
		loginpage=dashboard.ClickonSignin();
		forgotpasswordpage.validateForgotPasswordbutton();
		Thread.sleep(2000);
		passwordpage=forgotpasswordpage.ValidateForgotPassword(prop.getProperty("username"));
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
