/**
 * 
 */
package TestCase;
import java.util.HashMap;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseClass.BaseClass;
import Pages.Dashboard;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegistrationPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class RegistrationTestPage extends BaseClass
{
	LoginPage loginpage= new LoginPage();
	Dashboard dashboard = new Dashboard();
	MyAccountPage myaccountpage = new MyAccountPage();
	RegistrationPage registrationpage= new RegistrationPage();
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		launchApp();
	}
	@Test
	public void ValidateNewAccount() throws InterruptedException
	{
		loginpage= new LoginPage();
		dashboard = new Dashboard();
		loginpage=dashboard.ClickonSignin();
		Thread.sleep(3000);
		registrationpage=loginpage.createNewAccount(prop.getProperty("newaccount"));
	}
	@Test(priority = 2)
	public void createAccountTest(HashMap<String,String> hashMapValue) throws Throwable {
		dashboard = new Dashboard();
		loginpage=dashboard.ClickonSignin();
		registrationpage=loginpage.createNewAccount(hashMapValue.get("Email"));
		registrationpage.ValidateRegistration(
				hashMapValue.get("Gender"),
				hashMapValue.get("FirstName"),
				hashMapValue.get("LastName"),
				hashMapValue.get("SetPassword"),
				hashMapValue.get("Day"),
				hashMapValue.get("Month"),
				hashMapValue.get("Year"),
				hashMapValue.get("Company"),
				hashMapValue.get("Address"),
				hashMapValue.get("City"),
				hashMapValue.get("State"),
				hashMapValue.get("Country"),
				hashMapValue.get("Zipcode"),
				hashMapValue.get("MobilePhone"));
		myaccountpage=registrationpage.ValidateRegistrationbutton();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
