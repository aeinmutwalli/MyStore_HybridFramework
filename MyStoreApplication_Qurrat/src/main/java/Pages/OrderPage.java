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
public class OrderPage extends BaseClass 
{
	Action act = new Action();
	SearchResultPage searchresultpage;
	OrderPage orderpage;
	LoginPage loginpage;
	@FindBy (xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement ProceedtoCheckout;
	@FindBy (xpath="//*[@id=\"ordermsg\"]/textarea")
	WebElement txtbox;
	
	@FindBy (xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement checkoutbutton;
	
	@FindBy (xpath="//*[@id=\"cgv\"]")
	WebElement checkbox;
	
	@FindBy (xpath="//*[@id=\"form\"]/p/button/span")
	WebElement productoutAdd;
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void Validate_ProceedCheckout() throws Throwable
	{
		
		searchresultpage= new SearchResultPage();
		loginpage = new LoginPage();
		searchresultpage.searchAll("Top");
		orderpage=searchresultpage.add();
		Thread.sleep(2000);
		//orderpage.checkoutbutton();
		act.click(driver, ProceedtoCheckout);
		loginpage.sign(prop.getProperty("username"),prop.getProperty("password"));	
	}
	public void msgtext() throws Throwable
	{
		Thread.sleep(2000);
		txtbox.sendKeys("kjfnjsdcSDCkdj");
		Thread.sleep(2000);
		act.click(driver, checkoutbutton);
		//act.type(txtbox, txt);
	}
	
	public Payment address() throws Throwable
	{
		act.click(driver, checkbox);
		Thread.sleep(2000);
		act.click(driver, productoutAdd);
		return new Payment();
	}
}
