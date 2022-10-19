package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.Action;
import BaseClass.BaseClass;

public class SearchResultPage extends BaseClass
{
	Action act = new Action();
	@FindBy (xpath="//input[@id=\"search_query_top\"]")
	WebElement searchbox;
	
	@FindBy (xpath="//button[@name=\"submit_search\"]")
	WebElement searchbutton;
	
	@FindBy (xpath="//*[@id=\"best-sellers_block_right\"]/div/div/a/span")
	WebElement AllBestSeller;
	
	@FindBy (xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement imgclick;
	
	@FindBy (xpath="//input[@id=\"quantity_wanted\"]")
	WebElement Quantity;
	
	@FindBy (xpath="//select[@id=\"group_1\"]")
	WebElement S_Size;
	
	@FindBy (xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement Addtocartbutton;
	
	@FindBy (xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
	WebElement continueshopping;
	
	@FindBy (xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkout;
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchAll(String text) 
	{
		//act.click(driver, searchbox);
		act.type(searchbox, "top");
		act.click(driver, searchbutton);		
		//return new BestSeller();
	}
	/*
	public void VerifyQuantity(String quantity)
	{
		act.type(Quantity, quantity);
	}
	
	public void VerifySize(String size)
	{
		act.selectByVisibleText(size, S_Size);
	}
	public void Verify_Addtocart()
	{
		act.click(driver, Addtocartbutton);
	}
	*/
	public void Verifycontinueshopping()
	{
		act.click(driver, continueshopping);
	}
	public OrderPage add()throws Throwable
	{
		act.click(driver, imgclick);
		act.click(driver, Quantity);
		act.click(driver, S_Size);
		Thread.sleep(2000);
		act.click(driver, Addtocartbutton);
		Thread.sleep(2000);
		act.click(driver, checkout);
		Thread.sleep(2000);
		return new OrderPage();
	}
}
