/**
 * 
 */
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.MyAccountPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class LoginTestPage extends BaseClass
{
	Dashboard dashboard;
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test 
	public void VerifyLogin()
	{
		dashboard = new Dashboard();
		loginpage=dashboard.ClickonSignin();
		System.out.println("Welcome to Sign In");
		myaccountpage=loginpage.sign(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
