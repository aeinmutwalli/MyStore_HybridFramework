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
public class RegistrationPage extends BaseClass 
{
	
	Action act = new Action();
	Dashboard dashboard = new Dashboard();
	@FindBy (xpath="//a[@title=\"Return to Home\"]")
	private WebElement returntoHome;
	
	@FindBy (xpath="//input[@id=\"id_gender1\"]")
	private WebElement MrRadioButton;
	
	@FindBy (xpath="//input[@id=\"id_gender2\"]")
	private WebElement MsRadioButton;
	
	@FindBy (xpath="//input[@id=\"customer_firstname\"]")
	private WebElement Firstname;
	
	@FindBy (xpath="//input[@id=\"customer_lastname\"]")
	private WebElement Lastname;
	
	@FindBy (xpath="//input[@id=\"email\"]")
	private WebElement email;
	
	@FindBy (xpath="//input[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy (xpath="//select[@id=\"days\"]")
	private WebElement Day;
	
	@FindBy (xpath="//select[@id=\"months\"]")
	private WebElement month;
	
	@FindBy (xpath="//select[@id=\"years\"]")
	private WebElement year;
	/*
	@FindBy (xpath="//input[@id=\"newsletter\"]")
	private WebElement Checkboxsignup;
	
	@FindBy (xpath="//input[@id=\"optin\"]")
	private WebElement Checkboxoption;
	*/
	@FindBy (xpath="//input[@id=\"firstname\"]")
	private WebElement Addressname;
	
	@FindBy (xpath="//input[@id=\"lastname\"]")
	private WebElement Addlastname;
	
	@FindBy (xpath="//input[@id=\"company\"]")
	private WebElement AddCompany;
	
	@FindBy (xpath="//input[@id=\"address1\"]")
	private WebElement Address1;
	
	@FindBy (xpath="//input[@id=\"address2\"]")
	private WebElement Address2;
	
	@FindBy (xpath="//input[@id=\"city\"]")
	private WebElement city;
	
	@FindBy (xpath="//select[@id=\"id_state\"]")
	private WebElement state;
	
	@FindBy (xpath="//input[@id=\"postcode\"]")
	private WebElement postcode;
	
	@FindBy (xpath="//select[@id=\"id_country\"]")
	private WebElement country;
	
	@FindBy (xpath="//textarea[@id=\"other\"]")
	private WebElement text;
	
	@FindBy (xpath="//input[@id=\"phone\"]")
	private WebElement homephone;
	
	@FindBy (xpath="//input[@id=\"phone_mobile\"]")
	private WebElement mobilePhone;
	
	@FindBy (xpath="//input[@id=\"alias\"]")
	private WebElement assign;
	
	@FindBy (xpath="//button[@id=\"submitAccount\"]/span")
	private WebElement SubmitButton;
	
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	//Back to Home
	public Dashboard BackToHome()
	{
		act.click(driver, returntoHome);
		return new Dashboard();
	}
	//Registration Page
	public void ValidateRegistration(String gender, String fname, String Lname, String Pass,String day, String Month,
			String Year,String addcompany, String address1,
			String City,String State, String CountryName, String Postcode, String MobileNo)
	{
		if(gender.equalsIgnoreCase("Mr"))
		{
			act.click(driver, MrRadioButton);
		}else 
		{
			act.click(driver, MsRadioButton);
		}
		act.type(Firstname, fname);
		act.type(Lastname, Lname);
		act.type(password, Pass);
		act.selectByValue(Day, day);
		act.selectByValue(month, Month);
		act.selectByValue(year, Year);
		act.type(AddCompany, addcompany);
		act.type(Address1, address1);
		act.type(city, City);
		act.selectByVisibleText(State, state);
		act.type(postcode, Postcode);
		act.selectByVisibleText(CountryName, country);
		act.type(mobilePhone, MobileNo);
	}	
	
	public MyAccountPage ValidateRegistrationbutton()
	{

		act.click(driver, SubmitButton);
		return new MyAccountPage();
	}
}
