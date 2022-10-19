package TestCase;
import org.testng.Assert;
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
 * 
 */

/**
 * @author QurratulAeinMohammad
 *
 */
public class DashboardTestPage extends BaseClass
{
	//Action act= new Action();
	Dashboard dashboard; 
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	ForgotPasswordPage forgotpasswordPage;
	PasswordPage passwordpage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test(priority = 1)
	public void VerifyLogo()
	{
		dashboard= new Dashboard();
		boolean result= dashboard.validateLogo();
		Assert.assertTrue(result);
	}
	@Test(priority = 2)
	public void VerifySignIn()
	{
		dashboard = new Dashboard();
		loginpage=dashboard.ClickonSignin();
		System.out.println("Welcome to Sign In");
		myaccountpage=loginpage.sign(prop.getProperty("username"),prop.getProperty("password"));
	}
	/*
	@Test(priority = 3)
	public void VerifyForgorPassword()
	{
		dashboard = new Dashboard();
		loginpage= new LoginPage();
		forgotpasswordPage= new ForgotPasswordPage();
		loginpage=dashboard.ClickonSignin();
		forgotpasswordPage=loginpage.validateForgotPassword();
	}
	*/
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
