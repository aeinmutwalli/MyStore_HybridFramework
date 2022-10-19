/**
 * 
 */
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.OrderPage;
import Pages.Payment;
import Pages.SearchResultPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class PaymentTestPage extends BaseClass
{
	OrderPage orderpage;
	SearchResultPage searchresultpage;
	Payment payment;
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
		orderpage.Validate_ProceedCheckout();
		orderpage.msgtext();
		orderpage.address();
		payment.Validate_BankPay();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
