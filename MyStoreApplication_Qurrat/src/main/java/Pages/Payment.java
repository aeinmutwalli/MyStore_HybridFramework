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
public class Payment extends BaseClass
{
	Action act= new Action();
	@FindBy (xpath="//a[@class=\"bankwire\"]")
	WebElement paybank;
	
	@FindBy (xpath="//*[@id=\"cart_navigation\"]/button/span")
	WebElement confirmbank;
	
	@FindBy (xpath="//a[@class=\"cheque\"]")
	WebElement cheque;
	
	public Payment ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Validate_BankPay() throws Throwable
	{
		Thread.sleep(2000);
		act.click(driver, paybank);
		Thread.sleep(2000);
		act.click(driver, confirmbank);
	}
	public void Validate_Cheque()
	{
		act.click(driver, cheque);
	}
}
