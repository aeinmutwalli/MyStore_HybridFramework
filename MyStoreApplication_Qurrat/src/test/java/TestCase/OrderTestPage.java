/**
 * 
 */
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;
import Pages.OrderPage;
import Pages.SearchResultPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class OrderTestPage extends BaseClass
{
	OrderPage orderpage;
	SearchResultPage searchresultpage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test
	public void Verify_SearchBox() throws Throwable
	{
		orderpage= new OrderPage();
		searchresultpage= new SearchResultPage();
		Thread.sleep(2000);
		orderpage.Validate_ProceedCheckout();
		Thread.sleep(5000);
		//orderpage.msgtext(prop.getProperty("text"));
		orderpage.msgtext();
		orderpage.address();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
